package core.service;
import core.model.Renginys;
import core.model.Vieta;

import java.util.List;
/**
 * Created by daini on 2017-05-03.
 */
public interface  RenginysService {
    List<Renginys> findAllRenginys();
    List<String> gautiVisasRenginiuKategorijas();
    List<String> gautiVisasRenginiuTipuVietas();
    List<Vieta> gautiVisasEsamasVietas();
    List<String> gautiVisasBusenas();
    //-------------------------------------------
    void RezervuotisVieta(int renginioIndeksas, int vartotojoindeksas);
    List<String> gautiMygtukus(int vartotojokodas);
    List<String> gautiIspejimus(int vartotojoKodas);
    //-----------------------------------------
    List<Renginys> findAllOrganizatoriausRenginiai(int organizatoriausKodas);
     List<String> findAllOrganizatoriausKategorijos(int organizatoriausKodas);
     List<String> findAllOrganizatoriausVietosTipai(int organizatoriausKodas);
     List<Vieta> findAllOrganizatoriausVietos(int organizatoriausKodas);
    List<String> findAllOrganizatoriausBusenas(int organizatoriausKodas);
    void pasalintiOrganizatoriausRengini(int renginioIndeksas);
    Renginys findRenginysByRenginioKodas(int renginioKodas);
    List<Integer> findAllOrganizatoriausRezervacijas( int organizatoriausKodas);
    public  List<Integer> findAllRezervacijuDalyviuLimitus();
    void patvirtintiRengini(int renginioNumeris);

    //------Busena sector--------------------------------------------
    public List<Renginys> AtrinktiPagalBusena(int n);
    List<String> gautiVisasRenginiuKategorijasPatvirtinta(int busena);
    List<Integer> findAllRezervacijuDalyviuLimitusPatvirtinta(int busena);
    List<String> gautiVisasRenginiuTipuVietasPatvirtinta(int busena);
    List<Vieta> gautiVisasEsamasVietasPatvirtinta(int busena);
    List<String> gautiMygtukusPatvirtinta(int vartotojokodas, int busena);
    List<String> gautiIspejimusPatvirtinta(int vartotojoKodas, int busena);
    //------Busena ir Kategorija sector------------------------------
    List<Renginys> AtrintiPagalKategorija(int busena, int kategorija);
    List<String> gautiVisasRenginiuKategorijasPatvirtintaIrKategorija(int busena, int kategorija);
    List<Integer> findAllRezervacijuDalyviuLimitusPatvirtintaIrKategorija(int busena, int kategorija);
    List<String> gautiVisasRenginiuTipuVietasPatvirtintaIRKategorija(int busena, int kategorija);
    List<Vieta> gautiVisasEsamasVietasPatvirtintaIrKategorija(int busena, int kategorija);
    List<String> gautiMygtukusPatvirtintaIrKategorija(int vartotojokodas, int busena, int kategorija);
    List<String> gautiIspejimusPatvirtintaIrKategorija(int vartotojoKodas, int busena, int kategorija);

    }

