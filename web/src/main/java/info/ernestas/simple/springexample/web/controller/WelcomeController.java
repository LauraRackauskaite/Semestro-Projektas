package info.ernestas.simple.springexample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    @RequestMapping(value = "/")
    public String showIndex() {
        return "welcome";
    }

    @RequestMapping(value = "/registration")
    public String showIndex3() { return"registration"; }
    @RequestMapping(value = "/reg")
    public String showIndex2() { return"reg"; }
    @RequestMapping(value = "/login")
    public String showIndex4() { return"login"; }
}
