package core.service;
import core.model.Vartotojas;

import java.util.List;
/**
 * Created by daini on 2017-05-03.
 */
public interface VartotojasService {
    List<Vartotojas> findAllVartotojas();
    Vartotojas tikrintiIvestusDuomenis(String epastas, String slaptazodis);
    void registruotiNaujaVartotoja(int tipas, String vardas, String pavarde, int lytis,  String adresas,
                                   String ePastas, String slaptazodis);
    Vartotojas findByEpastas(String epastas);
    Vartotojas tikrintiRegistruojamaAsmeni(String epastas, String slaptazodis);
    Vartotojas redaguotiAsmensVarda(int id, String naujas);
    Vartotojas redaguotiAsmensPavarde(int id, String naujas);
    Vartotojas redaguotiAsmensAdresa(int id, String naujas);
}
