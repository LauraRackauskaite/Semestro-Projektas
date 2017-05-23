package core.dao;

import core.model.RenginioKategorija;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface RenginioKategorijaDao {
    List<RenginioKategorija> findAll();
    RenginioKategorija findByPavadinimas(String pavadinimas);
    RenginioKategorija findRenginioKategorijaByRenginioKategorijosNumeris(int renginioKategorijosNumeris);
}
