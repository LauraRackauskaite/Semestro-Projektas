package core.dao;

import core.model.RenginioVietosTipas;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface RenginioVietosTipasDao {
    List<RenginioVietosTipas> findAll();
    RenginioVietosTipas findByPavadinimas(String pavadinimas);
    RenginioVietosTipas findRenginioVietosTipasByVietosTipoNumeris(int vietosTipoNumeris);

}
