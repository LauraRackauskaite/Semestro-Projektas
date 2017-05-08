package info.ernestas.simple.springexample.web.controller;

import core.model.Vartotojas;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by daini on 2017-05-06.
 */
@Controller
public class RegistracijaController {
    @Autowired
    private VartotojasService Service;

    @RequestMapping(value = "/registracija", method = RequestMethod.GET)
    public  String showdRegistrationForm()
    {
        return  "registracija";
    }

    @RequestMapping(value = "/registracija", method = RequestMethod.POST)
    public  String verifyRegistracija(@RequestParam String vardas, @RequestParam String pavarde,
                                      @RequestParam String gridRadios,
                                      HttpSession session, Model model) {

        int tipas = Integer.parseInt(gridRadios);
       /* int lytis =
                System.out.println(tipas);*/


        /*Service.registruotiNaujaVartotoja(1, "Dsad",
               "dasda", 1,"dasd" , "das", "dasd");*/

        return "Vartotojas";
        //Vartotojas asmuo = Service.tikrintiIvestusDuomenis(epastas, slaptazodis);


       /* if(asmuo == null)
        {
            model.addAttribute("loginError", "Blogai įvesti duomenys. Bandykite dar kartą");
            return "login";
        }
        session.setAttribute("loggedInUser", asmuo);
        return "Vartotojas";*/


    }

}
