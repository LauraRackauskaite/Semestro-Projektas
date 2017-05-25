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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
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
    @RequestMapping(value = "/RenginysCreate", method = RequestMethod.POST)
    public  String CreateRenginys( @RequestParam int kategory,
                                   @RequestParam String pavadinimas,
                                  @RequestParam String trumpasAprasymas, @RequestParam String renginioData,
                                  @RequestParam String renginioLaikas, @RequestParam String renginioTrukme,
                                  @RequestParam int tip, @RequestParam String gatve, @RequestParam String miestas,
                                   @RequestParam int namNumeris,
                                  HttpSession session, Model model) {
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        Vartotojas organizatorius = (Vartotojas) session.getAttribute("loggedInUser");
        renginioKategorijaService.CreateEvent(kategory, pavadinimas, trumpasAprasymas, renginioData, renginioLaikas, renginioTrukme,
                tip,gatve, miestas, namNumeris, organizatorius.getVartotojoKodas());
        return "Organizatorius";
    }
}
