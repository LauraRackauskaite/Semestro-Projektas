package core.service;
import core.model.RenginioKategorija;
import core.model.RenginioVietosTipas;

import java.util.List;
/**
 * Created by daini on 2017-05-03.
 */
public interface RenginioKategorijaService {
    List<RenginioKategorija> findAllRenginioKategorija();
    List<RenginioVietosTipas> findAllRenginioVietosTipas();
    public void CreateEvent( int kategory,
                             String pavadinimas,
                             String trumpasAprasymas,  String renginioData,
                             String renginioLaikas,  String renginioTrukme,
                             int tip,  String gatve,  String miestas,
                             int namNumeris, int organizatoriausKodas);
   RenginioKategorija findRenginioKategorijaByRenginioKategorijosNumeris(int numeris);
}
