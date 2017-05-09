package info.ernestas.simple.springexample.web.controller;

import core.model.Vartotojas;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by daini on 2017-05-09.
 */
@Controller
public class NustatymaiController {
    @Autowired
    private VartotojasService Service;


    @RequestMapping(value = "/nustatymai", method = RequestMethod.GET)
    public String showSettingsForm(HttpSession session, Model model) {

        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");

        model.addAttribute("vartotojas", vartotojas);

        return "nustatymai";
    }
}
