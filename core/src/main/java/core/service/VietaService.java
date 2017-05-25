package core.service;
import core.model.Vieta;

import java.util.List;
/**
 * Created by daini on 2017-05-03.
 */
public interface VietaService {
    List<Vieta> findAllVieta();
    Vieta findVietaByVietosNumeris(int vietosNumeris);
}
