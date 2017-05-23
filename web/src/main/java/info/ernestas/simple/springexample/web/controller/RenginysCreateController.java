package info.ernestas.simple.springexample.web.controller;

import core.model.RenginioKategorija;
import core.model.RenginioVietosTipas;
import core.model.Vartotojas;
import core.service.RenginioKategorijaService;
import core.service.RenginysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller

public class RenginysCreateController {
    @Autowired
    private RenginioKategorijaService renginioKategorijaService;

    @RequestMapping(value = "/RenginysCreate", method = RequestMethod.GET)
    public String showRenginysCreate(HttpSession session, Model model) {
        List<RenginioKategorija> gautiVisasRenginioKategoijas = renginioKategorijaService.findAllRenginioKategorija();
        List<RenginioVietosTipas> gautiRenginioVietosTipus = renginioKategorijaService.findAllRenginioVietosTipas();
        Vartotojas organizatorius = (Vartotojas) session.getAttribute("loggedInUser");
        model.addAttribute("kategorijos", gautiVisasRenginioKategoijas);
        model.addAttribute("vietosTipas", gautiRenginioVietosTipus);
        return "RenginysCreate";
    }
    @RequestMapping(value = "/sukurimas", method = RequestMethod.POST)
    public  String CreateRenginys(
                                      HttpSession session, Model model) {
        Vartotojas organizatorius = (Vartotojas) session.getAttribute("loggedInUser");
        return "Organizatorius";
    }
}
