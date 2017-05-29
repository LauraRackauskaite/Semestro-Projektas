package info.ernestas.simple.springexample.web.controller;

import core.model.Renginys;
import core.model.Vartotojas;
import core.model.Vieta;
import core.service.RenginysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by daini on 2017-05-28.
 */
@Controller
public class AdminRenginiai {
    @Autowired
    private RenginysService renginysService;

    @RequestMapping(value = "/AdminRenginiai", method = RequestMethod.GET)
    public String showAdminRenginius(HttpSession session, Model model) {
        List<Integer> gautiSkaicius = renginysService.findAllRezervacijuDalyviuLimitus();
        List<Renginys> gautiVisusRenginius = renginysService.findAllRenginys();
        List<String> gautiVisasRenginiuKategorijas = renginysService.gautiVisasRenginiuKategorijas();
        List<String> gautiVisasRenginiuTipuVietas = renginysService.gautiVisasRenginiuTipuVietas();
        List<Vieta> gautiVisasRenginiuVietas = renginysService.gautiVisasEsamasVietas();
        List<String> gautiBusenas = renginysService.gautiVisasBusenas();
        model.addAttribute("visiRenginiai", gautiVisusRenginius);
        model.addAttribute("kategorijos", gautiVisasRenginiuKategorijas);
        model.addAttribute("vietuTipai", gautiVisasRenginiuTipuVietas);
        model.addAttribute("vietos", gautiVisasRenginiuVietas);
        model.addAttribute("gautiSkaicius", gautiSkaicius);
        model.addAttribute("visosBusenos", gautiBusenas);
        return "AdminRenginiai";
    }
    @RequestMapping(value = "/AdminRenginiaiPatvirtinta", method = RequestMethod.POST)
    public String showAdminRenginius(HttpSession session, Model model, @RequestParam int RenginioIndeksas1) {
        renginysService.patvirtintiRengini(RenginioIndeksas1);
        List<Integer> gautiSkaicius = renginysService.findAllRezervacijuDalyviuLimitus();
        List<Renginys> gautiVisusRenginius = renginysService.findAllRenginys();
        List<String> gautiVisasRenginiuKategorijas = renginysService.gautiVisasRenginiuKategorijas();
        List<String> gautiVisasRenginiuTipuVietas = renginysService.gautiVisasRenginiuTipuVietas();
        List<Vieta> gautiVisasRenginiuVietas = renginysService.gautiVisasEsamasVietas();
        List<String> gautiBusenas = renginysService.gautiVisasBusenas();
        model.addAttribute("visiRenginiai", gautiVisusRenginius);
        model.addAttribute("kategorijos", gautiVisasRenginiuKategorijas);
        model.addAttribute("vietuTipai", gautiVisasRenginiuTipuVietas);
        model.addAttribute("vietos", gautiVisasRenginiuVietas);
        model.addAttribute("gautiSkaicius", gautiSkaicius);
        model.addAttribute("visosBusenos", gautiBusenas);
        return "AdminRenginiai";
    }
    @RequestMapping(value = "/OrganizatoriusRenginysIstrinimas", method = RequestMethod.POST)
    public String show(HttpSession session, Model model, @RequestParam int RenginioIndeksas2){
        renginysService.pasalintiOrganizatoriausRengini(RenginioIndeksas2);
        List<Integer> gautiSkaicius = renginysService.findAllRezervacijuDalyviuLimitus();
        List<Renginys> gautiVisusRenginius = renginysService.findAllRenginys();
        List<String> gautiVisasRenginiuKategorijas = renginysService.gautiVisasRenginiuKategorijas();
        List<String> gautiVisasRenginiuTipuVietas = renginysService.gautiVisasRenginiuTipuVietas();
        List<Vieta> gautiVisasRenginiuVietas = renginysService.gautiVisasEsamasVietas();
        List<String> gautiBusenas = renginysService.gautiVisasBusenas();
        model.addAttribute("visiRenginiai", gautiVisusRenginius);
        model.addAttribute("kategorijos", gautiVisasRenginiuKategorijas);
        model.addAttribute("vietuTipai", gautiVisasRenginiuTipuVietas);
        model.addAttribute("vietos", gautiVisasRenginiuVietas);
        model.addAttribute("gautiSkaicius", gautiSkaicius);
        model.addAttribute("visosBusenos", gautiBusenas);
        return "AdminRenginiai";

    }
}
