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
    public  String verifyRegistracija(@RequestParam String gridRadios, @RequestParam String vardas,
                                      @RequestParam String pavarde, @RequestParam String gridRadios1,
                                      @RequestParam String adresas, @RequestParam String epastas,
                                      @RequestParam String slaptazodis,
                                      HttpSession session, Model model) {
        if(!vardas.isEmpty() && !pavarde.isEmpty() && !adresas.isEmpty() &&
        !epastas.isEmpty() && !slaptazodis.isEmpty()) {
            int tipas = Integer.parseInt(gridRadios);
            int lytis = Integer.parseInt(gridRadios1);
            Vartotojas asmuo = Service.tikrintiRegistruojamaAsmeni(epastas, slaptazodis);
            if (asmuo == null) {
            Service.registruotiNaujaVartotoja(tipas, vardas,
                    pavarde, lytis, adresas, epastas, slaptazodis);
            asmuo = Service.findByEpastas(epastas);
            session.setAttribute("loggedInUser", asmuo);
                return "Vartotojas";
            } else {
                model.addAttribute("existError", "Toks elektroninis paštas ar slaptažodis jau egzistuoja");
                return "registracija";
            }
        }
        else
        {
            model.addAttribute("existError", "Ne visi reikalingi laukai užpildyti");
            return "registracija";
        }
    }
}
