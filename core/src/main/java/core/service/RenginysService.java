package core.service;
import core.model.Renginys;
import core.model.Vieta;

import java.util.List;
/**
 * Created by daini on 2017-05-03.
 */
public interface RenginysService {
    List<Renginys> findAllRenginys();
    List<String> gautiVisasRenginiuKategorijas();
    List<String> gautiVisasRenginiuTipuVietas();
    List<Vieta> gautiVisasEsamasVietas();
    void RezervuotisVieta(int renginioIndeksas, int vartotojoindeksas);
    List<String> gautiMygtukus(int vartotojokodas);
    List<String> gautiIspejimus(int vartotojoKodas);
    //-----------------------------------------
    List<Renginys> findAllOrganizatoriausRenginiai(int organizatoriausKodas);
     List<String> findAllOrganizatoriausKategorijos(int organizatoriausKodas);
     List<String> findAllOrganizatoriausVietosTipai(int organizatoriausKodas);
     List<Vieta> findAllOrganizatoriausVietos(int organizatoriausKodas);
    List<String> findAllOrganizatoriausBusenas(int organizatoriausKodas);
    void pasalintiOrganizatoriausRengini(int renginioIndeksas, int vartotojoKodas);
    Renginys findRenginysByRenginioKodas(int renginioKodas);
}

