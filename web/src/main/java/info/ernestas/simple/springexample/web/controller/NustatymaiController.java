package info.ernestas.simple.springexample.web.controller;

import core.model.Vartotojas;
import core.service.TelefonasService;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by daini on 2017-05-09.
 */
@Controller
public class NustatymaiController {
    @Autowired
    private VartotojasService vartotojasService;

    @Autowired
    private TelefonasService  telefonasService;


    @RequestMapping(value = "/nustatymai", method = RequestMethod.GET)
    public String showSettingsForm(HttpSession session, Model model) {
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        model.addAttribute("vartotojas", vartotojas);
        model.addAttribute("modelVardas", vartotojas.getVardas());
        model.addAttribute("modelPavarde", vartotojas.getPavarde());
        model.addAttribute("modelAdresas", vartotojas.getAdresas());
        return "nustatymai";
    }
    @RequestMapping(value = "/nustatymai", method = RequestMethod.POST)
    public String verifySettings(@RequestParam String pavarde, @RequestParam String vardas,
                                 @RequestParam String telefonas, @RequestParam String adresas,
                                 HttpSession session, Model model) {
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        if(!vardas.isEmpty()) {
            vartotojasService.redaguotiAsmensVarda(vartotojas.getVartotojoKodas(), vardas);
        }
        if(!pavarde.isEmpty()) {
            vartotojasService.redaguotiAsmensPavarde(vartotojas.getVartotojoKodas(), pavarde);
        }
        if(!adresas.isEmpty()) {
            vartotojasService.redaguotiAsmensAdresa(vartotojas.getVartotojoKodas(), adresas);
        }
        if(!telefonas.isEmpty()) {
            telefonasService.redaguotiAsmensTelefona(vartotojas.getVartotojoKodas(), telefonas);
        }
        vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        model.addAttribute("vartotojas", vartotojas);
        model.addAttribute("modelVardas", vartotojas.getVardas());
        model.addAttribute("modelPavarde", vartotojas.getPavarde());
        model.addAttribute("modelAdresas", vartotojas.getAdresas());
        return "redirect: /nustatymai";
    }

    @RequestMapping(value = "/istrinimas", method = RequestMethod.POST)
    public String verifyIstrinti(HttpSession session, Model model) {
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        vartotojasService.istrintiVartotoja(vartotojas);
        return "index";
    }
}
