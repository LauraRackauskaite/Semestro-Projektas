package info.ernestas.simple.springexample.web.controller;

import core.model.Vartotojas;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    private VartotojasService vartotojasService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public  String verifyIndex(@RequestParam String epastas, @RequestParam String slaptazodis,
                               HttpSession session, Model model) {
        Vartotojas vartotojas = vartotojasService.tikrintiIvestusDuomenis(epastas, slaptazodis);
        if(vartotojas == null)
        {
            model.addAttribute("loginError", "Blogai įvesti duomenys. Bandykite dar kartą");
            return "vietos";
        }
        session.setAttribute("loggedInUser", vartotojas);
        return "Vartotojas";
    }
}
