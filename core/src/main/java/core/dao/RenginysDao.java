package core.dao;

import core.model.Renginys;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface RenginysDao {
    List<Renginys> findAll();
    Renginys findByPavadinimas(String renginioPavadinimas);
}
