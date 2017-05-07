package info.ernestas.simple.springexample.web.controller;

import core.service.VietaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daini on 2017-05-06.
 */
@Controller
@RequestMapping("/vietos")
public class VietosController {

    @Autowired
    private VietaService vietaService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAllNames(Model model) {
        model.addAttribute("vietos",vietaService.findAllVieta() );
        return "vietos";
    }
}
