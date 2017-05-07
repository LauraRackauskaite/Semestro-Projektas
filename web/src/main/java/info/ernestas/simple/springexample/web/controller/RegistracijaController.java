package info.ernestas.simple.springexample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daini on 2017-05-06.
 */
@Controller
@RequestMapping("/registracija")
public class RegistracijaController {
    @RequestMapping(value = "/")
    public String showIndex() {
        return "registracija";
    }
    @RequestMapping(value = "/registracijaduomenys", method = RequestMethod.GET)
    public String showIndex2() { return"registracijaduomenys"; }
}
