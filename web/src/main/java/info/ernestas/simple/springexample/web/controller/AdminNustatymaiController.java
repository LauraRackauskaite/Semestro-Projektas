package info.ernestas.simple.springexample.web.controller;

import core.model.Vartotojas;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by daini on 2017-05-22.
 */
@Controller
public class AdminNustatymaiController {
    @Autowired
    private VartotojasService service;


    @RequestMapping(value = "/AdminNustatymai", method = RequestMethod.GET)
    public String showSettingsForm() {
        return "AdminNustatymai";
    }

    @RequestMapping(value = "/vartotojuAtaskaita", method = RequestMethod.POST)
    public String getVartotojuAtaskaita(ModelMap model, HttpSession session) {

        Vartotojas administratorius = (Vartotojas) session.getAttribute("loggedInUser");
        List<String> susietiTipai = service.GetAllEsamuVartotojuTipus();
        List<Vartotojas> vartotojai = service.GetAllVartotojasAtaskaita();
        List<String> susietosLytis = service.GetAllEsamuLytis();
        List<Integer> suskaiciuotosRezervacijos = service.GetAllEsamuRezervacijas();
        Integer gautiVartoSk = service.SkaicuotiAsmenis(1);
        Integer gautiOrgaSk = service.SkaicuotiAsmenis(2);
        Integer gautiAdminSk = service.SkaicuotiAsmenis(3);
        Integer gautiAsmenSk = gautiVartoSk + gautiOrgaSk + gautiAdminSk;
        Integer visosRezervacijos = service.SkaicuotiVisasRezervacijas();
        model.addAttribute("varto", vartotojai);
        model.addAttribute("tipai", susietiTipai);
        model.addAttribute("lytis", susietosLytis);
        model.addAttribute("rezervSk", suskaiciuotosRezervacijos);
        model.addAttribute("AsmenysSk", gautiAsmenSk);
        model.addAttribute("vartoSk", gautiVartoSk);
        model.addAttribute("orgaSk", gautiOrgaSk);
        model.addAttribute("adminSk", gautiAdminSk);
        model.addAttribute("visosRezervSk", visosRezervacijos);

        return "AdminNustatymaiVartotojuAtaskaita";
    }
}
