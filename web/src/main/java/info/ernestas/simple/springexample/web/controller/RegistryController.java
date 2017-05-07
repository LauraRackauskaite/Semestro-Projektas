package info.ernestas.simple.springexample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Reg")
public class RegistryController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        return "registration";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String showIndex2() { return"reg"; }

    @RequestMapping(value = "/regis", method = RequestMethod.GET)
    public String showIndex3() { return"regis"; }

    @RequestMapping(value = "/login")
    public String showIndex4() { return"login"; }
}
