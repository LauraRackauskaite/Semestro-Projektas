package core.dao;

import core.model.Telefonas;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface TelefonasDao {
    List<Telefonas> findAll();
    Telefonas findByVartotojoKodas(String vartotojoKodas);
}
