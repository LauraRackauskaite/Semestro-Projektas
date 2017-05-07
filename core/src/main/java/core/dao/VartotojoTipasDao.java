package core.dao;

import core.model.VartotojoTipas;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface VartotojoTipasDao {
    List<VartotojoTipas> findAll();
    VartotojoTipas findByTipas(String pavadinimas);
}
