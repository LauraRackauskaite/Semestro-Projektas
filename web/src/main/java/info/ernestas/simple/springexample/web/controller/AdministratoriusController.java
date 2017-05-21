package info.ernestas.simple.springexample.web.controller;

import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daini on 2017-05-21.
 */
@Controller
public class AdministratoriusController {
    @Autowired
    private VartotojasService Service;
    @RequestMapping(value = "/Administratorius", method = RequestMethod.GET)
    public String showSettingsForm() {

        return "Administratorius";
    }
}
