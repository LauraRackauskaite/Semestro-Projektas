package core.dao;

import core.model.Vieta;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface VietaDao {
    List<Vieta> findAll();
    Vieta findByGatvesPavadinimasAndMiestas(String gatvesPavadinimas, String miestas);
    Vieta findVietaByVietosNumeris(int vietosNumeris);
}
