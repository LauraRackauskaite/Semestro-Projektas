package core.dao;

import core.model.RenginioBusena;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface RenginioBusenaDao {
    List<RenginioBusena> findAll();
    RenginioBusena findByBusenosPavadinimas(String pavadinimas);
    RenginioBusena findRenginioBusenaByRenginioBusenosNumeris(int renginioBusenosNumeris);
}
