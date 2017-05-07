package core.dao;

import core.model.Priminimas;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface PriminimasDao {
    List<Priminimas> findAll();
    Priminimas findByRezervavimoKodas(int rezervavimoKodas);
}
