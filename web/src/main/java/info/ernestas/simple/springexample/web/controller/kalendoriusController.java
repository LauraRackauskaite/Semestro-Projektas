package info.ernestas.simple.springexample.web.controller;

import core.model.Renginys;
import core.model.Vartotojas;
import core.service.VartotojasService;
import core.service.RenginysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class kalendoriusController {
    @Autowired
    private RenginysService renginysService;
    @Autowired
    private VartotojasService Service;
    @RequestMapping(value = "/kalendorius", method = RequestMethod.GET)
    public String showVartotojaskalendorius(HttpSession session, Model model) {
        Vartotojas vartotojas = (Vartotojas) session.getAttribute("loggedInUser");
        List<Renginys> gautiVisusRenginius = renginysService.findAllRenginys();
        model.addAttribute("visiRenginiai", gautiVisusRenginius);
        return "kalendorius";
    }

}
