package info.ernestas.simple.springexample.web.controller;

import core.model.Renginys;
import core.model.Vartotojas;
import core.model.Vieta;
import core.service.RenginysService;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class VartotojasRenginiaiController {

    @Autowired
    private VartotojasService vartotojasService;

    @Autowired
    private RenginysService renginysService;

    @RequestMapping(value = "/VartotojasRenginiai", method = RequestMethod.GET)
    public String showVisusRenginius(HttpSession session, Model model){
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        List<Renginys> gautiVisusRenginius = renginysService.findAllRenginys();
        List<String> gautiVisasRenginiuKategorijas = renginysService.gautiVisasRenginiuKategorijas();
        List<String> gautiVisasRenginiuTipuVietas = renginysService.gautiVisasRenginiuTipuVietas();
        List<Vieta> gautiVisasRenginiuVietas = renginysService.gautiVisasEsamasVietas();
        List<String> gautiMygtukus = renginysService.gautiMygtukus(vartotojas.getVartotojoKodas());
        List<String> gautiIspejimus = renginysService.gautiIspejimus(vartotojas.getVartotojoKodas());

        model.addAttribute("visiRenginiai", gautiVisusRenginius);
        model.addAttribute("kategorijos", gautiVisasRenginiuKategorijas);
        model.addAttribute("vietuTipai", gautiVisasRenginiuTipuVietas);
        model.addAttribute("vietos", gautiVisasRenginiuVietas);
        model.addAttribute("gautiMygtukus", gautiMygtukus);
        model.addAttribute("gautiIspejimus", gautiIspejimus);
        return "VartotojasRenginiai";
    }

    @RequestMapping(value = "/VartotojasRenginiai", method = RequestMethod.POST)
    public String RezervuotisRengini(HttpSession session, Model model,  @RequestParam int RenginioIndeksas)
    {
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        renginysService.RezervuotisVieta(RenginioIndeksas, vartotojas.getVartotojoKodas());
        List<Renginys> gautiVisusRenginius = renginysService.findAllRenginys();
        List<String> gautiVisasRenginiuKategorijas = renginysService.gautiVisasRenginiuKategorijas();
        List<String> gautiVisasRenginiuTipuVietas = renginysService.gautiVisasRenginiuTipuVietas();
        List<Vieta> gautiVisasRenginiuVietas = renginysService.gautiVisasEsamasVietas();
        List<String> gautiMygtukus = renginysService.gautiMygtukus(vartotojas.getVartotojoKodas());
        List<String> gautiIspejimus = renginysService.gautiIspejimus(vartotojas.getVartotojoKodas());
        model.addAttribute("visiRenginiai", gautiVisusRenginius);
        model.addAttribute("kategorijos", gautiVisasRenginiuKategorijas);
        model.addAttribute("vietuTipai", gautiVisasRenginiuTipuVietas);
        model.addAttribute("vietos", gautiVisasRenginiuVietas);
        model.addAttribute("gautiMygtukus", gautiMygtukus);
        model.addAttribute("gautiIspejimus", gautiIspejimus);
        return "VartotojasRenginiai";
    }
}
