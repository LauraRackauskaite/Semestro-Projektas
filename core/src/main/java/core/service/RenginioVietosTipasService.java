package core.service;
import core.model.RenginioVietosTipas;

import java.util.List;
/**
 * Created by daini on 2017-05-03.
 */
public interface RenginioVietosTipasService {
    List<RenginioVietosTipas> findAllRenginioVietosTipas();
    RenginioVietosTipas findRenginioVietosTipasByVietosTipoNumeris(int vietosTipoNumeris);
}
