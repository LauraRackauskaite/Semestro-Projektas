package core.service;
import core.model.Telefonas;

import java.util.List;
/**
 * Created by daini on 2017-05-03.
 */
public interface TelefonasService {
    List<Telefonas> findAllTelefonas();
    void redaguotiAsmensTelefona(int id, String telefonas);
}
