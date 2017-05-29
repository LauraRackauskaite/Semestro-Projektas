package info.ernestas.simple.springexample.web.controller;

import core.model.Renginys;
import core.model.Vartotojas;
import core.model.Vieta;
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
public class VartotojasRezervavimaiController {
    @Autowired
    private VartotojasService Service;
    @RequestMapping(value = "/VartotojasRezervavimai", method = RequestMethod.GET)
    public String showVartotojoRezervavimus(HttpSession session, Model model){
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        List<Integer>  gautiSkaicius = Service.gautiRezervuoturenginiuDalyviuLimitus(vartotojas.getVartotojoKodas());
        List<Renginys> gautiVartotojoRenginius = Service.gautiVartotojoRenginius(vartotojas.getVartotojoKodas());
        List<String> gautiVartotojoKategorijasRenginius = Service.gautiVartotojoKategorijasRenginius(vartotojas.getVartotojoKodas());
        List<Vieta>  gautiVartotojovietasRenginiuose = Service.gautiVartotojovietasRenginiuose(vartotojas.getVartotojoKodas());
        List<String> gautiVartotojuVietuTipus = Service.gautiVartotojovietuTipus(vartotojas.getVartotojoKodas());
        model.addAttribute("vartoRengi", gautiVartotojoRenginius);
        model.addAttribute("kategorijos", gautiVartotojoKategorijasRenginius);
        model.addAttribute("vietos", gautiVartotojovietasRenginiuose);
        model.addAttribute("vietuTipai", gautiVartotojuVietuTipus);
        model.addAttribute("gautiSkaicius", gautiSkaicius);
        return "VartotojasRezervavimai";
    }
 @RequestMapping(value = "/VartotojasRezervavimai",  method = RequestMethod.POST)
 public String redaguotiRezervavimus(HttpSession session, Model model, @RequestParam int RenginioIndeksas){
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
           Service.TrintiRezervacija( RenginioIndeksas, vartotojas.getVartotojoKodas());
     List<Integer>  gautiSkaicius = Service.gautiRezervuoturenginiuDalyviuLimitus(vartotojas.getVartotojoKodas());
     List<Renginys> gautiVartotojoRenginius = Service.gautiVartotojoRenginius(vartotojas.getVartotojoKodas());
     List<String> gautiVartotojoKategorijasRenginius = Service.gautiVartotojoKategorijasRenginius(vartotojas.getVartotojoKodas());
     List<Vieta>  gautiVartotojovietasRenginiuose = Service.gautiVartotojovietasRenginiuose(vartotojas.getVartotojoKodas());
     List<String> gautiVartotojuVietuTipus = Service.gautiVartotojovietuTipus(vartotojas.getVartotojoKodas());
     model.addAttribute("vartoRengi", gautiVartotojoRenginius);
     model.addAttribute("kategorijos", gautiVartotojoKategorijasRenginius);
     model.addAttribute("vietos", gautiVartotojovietasRenginiuose);
     model.addAttribute("vietuTipai", gautiVartotojuVietuTipus);
     model.addAttribute("gautiSkaicius", gautiSkaicius);
  return "VartotojasRezervavimai";
 }
}
