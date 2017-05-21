package info.ernestas.simple.springexample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daini on 2017-05-20.
 */
@Controller
public class RenginiaiController {
    @RequestMapping(value = "/Renginiai", method = RequestMethod.GET)
    public String showLoginForm() {
        return "Renginiai";
    }
}
