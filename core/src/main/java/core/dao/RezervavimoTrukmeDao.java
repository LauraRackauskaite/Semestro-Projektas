package core.dao;

import core.model.RezervavimoTrukme;

import java.util.Date;
import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface RezervavimoTrukmeDao {
    List<RezervavimoTrukme> findAll();
    RezervavimoTrukme findByLaikasNuoAndLaikasIki(Date laikasNuo, Date laikasIki);
}
