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
}
