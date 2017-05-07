package info.ernestas.simple.springexample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/regis")
public class RegController {
    @RequestMapping(value = "/")
    public String showIndex() {
        return "regis";
    }


}
