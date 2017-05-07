package core.dao.repository;

import core.model.Atsiliepimas;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-03.
 */
public interface AtsiliepimasRepository extends JpaRepository<Atsiliepimas, Integer> {
    Atsiliepimas findByRenginioKodasAndVartotojoKodas(int renginioKodas, int VartotojoKodas);
}
