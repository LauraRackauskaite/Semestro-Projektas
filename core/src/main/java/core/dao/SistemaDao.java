package core.dao;

import core.model.Sistema;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface SistemaDao {
    List<Sistema> findAll();
    Sistema findByPagrindineNustatymoReiksme(String pagrindineNustatymoReiksme);
}
