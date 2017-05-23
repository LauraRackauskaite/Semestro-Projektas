package info.ernestas.simple.springexample.web.controller;

import core.model.Renginys;
import core.model.Vartotojas;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by daini on 2017-05-09.
 */
@Controller
public class VartotojasController {
    @Autowired
    private VartotojasService Service;
    @RequestMapping(value = "/Vartotojas", method = RequestMethod.GET)
    public String showSettingsForm() {
        return "Vartotojas";
    }

}
