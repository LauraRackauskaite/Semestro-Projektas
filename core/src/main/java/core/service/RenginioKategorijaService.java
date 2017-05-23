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
}
