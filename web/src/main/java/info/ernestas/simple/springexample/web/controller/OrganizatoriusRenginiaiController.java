package info.ernestas.simple.springexample.web.controller;

import core.model.*;
import core.service.RenginioKategorijaService;
import core.service.RenginioVietosTipasService;
import core.service.RenginysService;
import core.service.VietaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrganizatoriusRenginiaiController {
    @Autowired
    private RenginysService Service;

    @Autowired
    private RenginioKategorijaService renginioKategorijaService;

    @Autowired
    private RenginioVietosTipasService renginioVietosTipasService;

    @Autowired
    private VietaService vietaService;

    @RequestMapping(value = "/OrganizatoriusRenginiai", method = RequestMethod.GET)
    public String showOrganizatoriausRenginiai(HttpSession session, Model model){
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        List<Renginys> organizatoriausRenginiai = Service.findAllOrganizatoriausRenginiai(vartotojas.getVartotojoKodas());
        List<String> organizatoriausKategorijos = Service.findAllOrganizatoriausKategorijos(vartotojas.getVartotojoKodas());
        List<String> organizatoriausVietuTipai = Service.findAllOrganizatoriausVietosTipai(vartotojas.getVartotojoKodas());
        List<Vieta> organizatoriausVietos = Service.findAllOrganizatoriausVietos(vartotojas.getVartotojoKodas());
        List<String>organizatoriausBusenos = Service.findAllOrganizatoriausBusenas(vartotojas.getVartotojoKodas());
        model.addAttribute("visiRenginiai", organizatoriausRenginiai);
        model.addAttribute("kategorijos", organizatoriausKategorijos);
        model.addAttribute("vietuTipai", organizatoriausVietuTipai);
        model.addAttribute("vietos", organizatoriausVietos);
        model.addAttribute("busenos", organizatoriausBusenos);
        return "OrganizatoriusRenginiai";
    }
    @RequestMapping(value = "/OrganizatoriusRenginysIstrinimas", method = RequestMethod.POST)
    public String show(HttpSession session, Model model, @RequestParam int RenginioIndeksas2){
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        Service.pasalintiOrganizatoriausRengini(RenginioIndeksas2, vartotojas.getVartotojoKodas());
        List<Renginys> organizatoriausRenginiai = Service.findAllOrganizatoriausRenginiai(vartotojas.getVartotojoKodas());
        List<String> organizatoriausKategorijos = Service.findAllOrganizatoriausKategorijos(vartotojas.getVartotojoKodas());
        List<String> organizatoriausVietuTipai = Service.findAllOrganizatoriausVietosTipai(vartotojas.getVartotojoKodas());
        List<Vieta> organizatoriausVietos = Service.findAllOrganizatoriausVietos(vartotojas.getVartotojoKodas());
        List<String>organizatoriausBusenos = Service.findAllOrganizatoriausBusenas(vartotojas.getVartotojoKodas());
        model.addAttribute("visiRenginiai", organizatoriausRenginiai);
        model.addAttribute("kategorijos", organizatoriausKategorijos);
        model.addAttribute("vietuTipai", organizatoriausVietuTipai);
        model.addAttribute("vietos", organizatoriausVietos);
        model.addAttribute("busenos", organizatoriausBusenos);
        return "OrganizatoriusRenginiai";
    }
    @RequestMapping(value = "/OrganizatoriusRenginysRedagavimas", method = RequestMethod.POST)
    public String redaguoti(HttpSession session, Model model, @RequestParam int RenginioIndeksas1) {
        Renginys redaguoti = Service.findRenginysByRenginioKodas(RenginioIndeksas1);
        List<RenginioKategorija> renginiokategorijos = renginioKategorijaService.findAllRenginioKategorija();
        List<RenginioVietosTipas> renginioVietosTipai = renginioKategorijaService.findAllRenginioVietosTipas();
        RenginioKategorija renginioKategorija = renginioKategorijaService.findRenginioKategorijaByRenginioKategorijosNumeris(redaguoti.getRenginioKategorijosKodas());
        RenginioVietosTipas renginioVietosTipas = renginioVietosTipasService.findRenginioVietosTipasByVietosTipoNumeris(redaguoti.getRenginioTipoKodas());
        Vieta einamaVieta = vietaService.findVietaByVietosNumeris(redaguoti.getRenginioVietosKodas());
        model.addAttribute("redaguojamas", redaguoti);
        model.addAttribute("kategorijos", renginiokategorijos);
        model.addAttribute("vietosTipas", renginioVietosTipai);
        model.addAttribute("einamaKategorija", renginioKategorija);
        model.addAttribute("einamasVietosTipas", renginioVietosTipas);
        model.addAttribute("einamaVieta", einamaVieta);
        return "OrganizatoriusRenginysRedagavimas";
    }
    @RequestMapping(value = "/OrganizatoriusRenginysIsaugotiPakeitimus", method = RequestMethod.POST)
    public  String OrganizatoriusRenginysIsaugotiPakeitimus( @RequestParam int kategory,
                                                @RequestParam String pavadinimas,
                                                @RequestParam String trumpasAprasymas, @RequestParam String renginioData,
                                                @RequestParam String renginioLaikas, @RequestParam String renginioTrukme,
                                                @RequestParam int VietosTip, @RequestParam String gatve, @RequestParam String miestas,
                                                @RequestParam int namNumeris,
                                                HttpSession session, Model model){

        return "OrganizatoriusRenginiai";
    }
}

