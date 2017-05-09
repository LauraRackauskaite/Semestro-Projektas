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
public class LoginController {

    @Autowired
    private VartotojasService Service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String verifyLogin(@RequestParam String epastas, @RequestParam String slaptazodis,
                              HttpSession session, Model model) {

        Vartotojas asmuo = Service.tikrintiIvestusDuomenis(epastas, slaptazodis);
        if(asmuo == null) {
            model.addAttribute("loginError", "Blogai įvesti duomenys. Bandykite dar kartą");
            return "login";
        }
        session.setAttribute("loggedInUser", asmuo);
        return "redirect: /Vartotojas/";
    }
}