package info.ernestas.simple.springexample.web.controller;

import core.model.RenginioKategorija;
import core.model.Renginys;
import core.model.Vartotojas;
import core.model.Vieta;
import core.service.RenginioKategorijaService;
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
    @Autowired
    private RenginioKategorijaService renginioKategorijaService;


    @RequestMapping(value = "/VartotojasRenginiai", method = RequestMethod.GET)
    public String showVisusRenginius(HttpSession session, Model model){
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        List<Integer> gautiSkaicius = renginysService.findAllRezervacijuDalyviuLimitusPatvirtinta(2);
        List<Renginys> gautiVisusRenginius = renginysService.AtrinktiPagalBusena(2);
        List<String> gautiVisasRenginiuKategorijas = renginysService.gautiVisasRenginiuKategorijasPatvirtinta(2);
        List<String> gautiVisasRenginiuTipuVietas = renginysService.gautiVisasRenginiuTipuVietasPatvirtinta(2);
        List<Vieta> gautiVisasRenginiuVietas = renginysService.gautiVisasEsamasVietasPatvirtinta(2);
        List<String> gautiMygtukus = renginysService.gautiMygtukusPatvirtinta(vartotojas.getVartotojoKodas(), 2);
        List<String> gautiIspejimus = renginysService.gautiIspejimusPatvirtinta(vartotojas.getVartotojoKodas(), 2);
        //*******
        List<RenginioKategorija> gautiVisasRenginioKategoijas = renginioKategorijaService.findAllRenginioKategorija();
        //******
        model.addAttribute("visiRenginiai", gautiVisusRenginius);
        model.addAttribute("kategorijos", gautiVisasRenginiuKategorijas);
        model.addAttribute("vietuTipai", gautiVisasRenginiuTipuVietas);
        model.addAttribute("vietos", gautiVisasRenginiuVietas);
        model.addAttribute("gautiMygtukus", gautiMygtukus);
        model.addAttribute("gautiIspejimus", gautiIspejimus);
        model.addAttribute("gautiSkaicius", gautiSkaicius);
        model.addAttribute("gautiVisasRenginioKategoijas", gautiVisasRenginioKategoijas);

        return "VartotojasRenginiai";
    }

    @RequestMapping(value = "/VartotojasRenginiai", method = RequestMethod.POST)
    public String RezervuotisRengini(HttpSession session, Model model,  @RequestParam int RenginioIndeksas)
    {
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        renginysService.RezervuotisVieta(RenginioIndeksas, vartotojas.getVartotojoKodas());
        List<Integer> gautiSkaicius = renginysService.findAllRezervacijuDalyviuLimitusPatvirtinta(2);
        List<Renginys> gautiVisusRenginius = renginysService.AtrinktiPagalBusena(2);
        List<String> gautiVisasRenginiuKategorijas = renginysService.gautiVisasRenginiuKategorijasPatvirtinta(2);
        List<String> gautiVisasRenginiuTipuVietas = renginysService.gautiVisasRenginiuTipuVietasPatvirtinta(2);
        List<Vieta> gautiVisasRenginiuVietas = renginysService.gautiVisasEsamasVietasPatvirtinta(2);
        List<String> gautiMygtukus = renginysService.gautiMygtukusPatvirtinta(vartotojas.getVartotojoKodas(), 2);
        List<String> gautiIspejimus = renginysService.gautiIspejimusPatvirtinta(vartotojas.getVartotojoKodas(), 2);
        //*******
        List<RenginioKategorija> gautiVisasRenginioKategoijas = renginioKategorijaService.findAllRenginioKategorija();
        //******
        model.addAttribute("visiRenginiai", gautiVisusRenginius);
        model.addAttribute("kategorijos", gautiVisasRenginiuKategorijas);
        model.addAttribute("vietuTipai", gautiVisasRenginiuTipuVietas);
        model.addAttribute("vietos", gautiVisasRenginiuVietas);
        model.addAttribute("gautiMygtukus", gautiMygtukus);
        model.addAttribute("gautiIspejimus", gautiIspejimus);
        model.addAttribute("gautiSkaicius", gautiSkaicius);
        model.addAttribute("gautiVisasRenginioKategoijas", gautiVisasRenginioKategoijas);
        return "VartotojasRenginiai";
    }

    @RequestMapping(value = "/VartotojasRenginiaiAtrinkti", method = RequestMethod.POST)
    public String AtrinktiRenginius(HttpSession session, Model model, @RequestParam int kategory) {
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        List<Integer> gautiSkaicius = renginysService.findAllRezervacijuDalyviuLimitusPatvirtintaIrKategorija(2, kategory);
        List<Renginys> gautiVisusRenginius = renginysService.AtrintiPagalKategorija(2, kategory);
        List<String> gautiVisasRenginiuKategorijas = renginysService.gautiVisasRenginiuKategorijasPatvirtintaIrKategorija(2, kategory);
        List<String> gautiVisasRenginiuTipuVietas = renginysService.gautiVisasRenginiuTipuVietasPatvirtintaIRKategorija(2,kategory);
        List<Vieta> gautiVisasRenginiuVietas = renginysService.gautiVisasEsamasVietasPatvirtintaIrKategorija(2, kategory);
        List<String> gautiMygtukus = renginysService.gautiMygtukusPatvirtintaIrKategorija(vartotojas.getVartotojoKodas(), 2, kategory);
        List<String> gautiIspejimus = renginysService.gautiIspejimusPatvirtintaIrKategorija(vartotojas.getVartotojoKodas(), 2, kategory);
        //*******
        List<RenginioKategorija> gautiVisasRenginioKategoijas = renginioKategorijaService.findAllRenginioKategorija();
        //******
        model.addAttribute("visiRenginiai", gautiVisusRenginius);
        model.addAttribute("kategorijos", gautiVisasRenginiuKategorijas);
        model.addAttribute("vietuTipai", gautiVisasRenginiuTipuVietas);
        model.addAttribute("vietos", gautiVisasRenginiuVietas);
        model.addAttribute("gautiMygtukus", gautiMygtukus);
        model.addAttribute("gautiIspejimus", gautiIspejimus);
        model.addAttribute("gautiSkaicius", gautiSkaicius);
        model.addAttribute("gautiVisasRenginioKategoijas", gautiVisasRenginioKategoijas);


        return "VartotojasRenginiai";
    }
}
