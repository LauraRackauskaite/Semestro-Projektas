package core.dao;

import core.model.Atsiliepimas;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface AtsiliepimasDao {
    List<Atsiliepimas> findAll();
    Atsiliepimas findByRenginioKodasAndVartotojoKodas(int renginioKodas, int VartotojoKodas);
}
