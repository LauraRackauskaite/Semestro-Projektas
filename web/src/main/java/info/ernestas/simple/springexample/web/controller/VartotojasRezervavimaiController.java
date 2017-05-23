package info.ernestas.simple.springexample.web.controller;

import core.model.Renginys;
import core.model.Vartotojas;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class VartotojasRezervavimaiController {
    @Autowired
    private VartotojasService Service;
    @RequestMapping(value = "/VartotojasRezervavimai", method = RequestMethod.GET)
    public String showVartotojoRezervavimus(HttpSession session, Model model){
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        List<Renginys> gautiVartotojoRenginius = Service.gautiVartotojoRenginius(vartotojas.getVartotojoKodas());
        List<String> gautiVartotojoKategorijasRenginius = Service.gautiVartotojoKategorijasRenginius(vartotojas.getVartotojoKodas());
        model.addAttribute("vartoRengi", gautiVartotojoRenginius);
        model.addAttribute("kategorijos", gautiVartotojoKategorijasRenginius);
        return "VartotojasRezervavimai";
    }
}
