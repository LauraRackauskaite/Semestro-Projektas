package core.service;
import core.model.Vartotojas;

import java.util.List;
/**
 * Created by daini on 2017-05-03.
 */
public interface VartotojasService {
    List<Vartotojas> findAllVartotojas();
    Vartotojas tikrintiIvestusDuomenis(String epastas, String slaptazodis);
}
