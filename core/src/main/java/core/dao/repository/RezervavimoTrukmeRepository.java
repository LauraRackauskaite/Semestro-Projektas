package core.dao.repository;
import core.model.RezervavimoTrukme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * Created by daini on 2017-05-04.
 */
public interface RezervavimoTrukmeRepository extends JpaRepository<RezervavimoTrukme, Integer>{
    RezervavimoTrukme findByLaikasNuoAndLaikasIki(Date laikasNuo, Date laikasIki);
}
