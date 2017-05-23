package info.ernestas.simple.springexample.web.controller;

import core.service.RenginysService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by daini on 2017-05-20.
 */
@Controller

public class RenginiaiController {
    RenginysService service;
    @RequestMapping(value = "/Renginiai", method = RequestMethod.GET)
    public String showRenginius(Model model, HttpSession session) {
    session.getAttribute("loggedInUser");
model.addAttribute("renginiai", service.findAllRenginys());
        return "Renginiai";
    }
}
