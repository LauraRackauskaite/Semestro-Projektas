package core.dao.repository;
import core.model.Rezervavimas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
public interface RezervavimasRepository extends JpaRepository<Rezervavimas, Integer>{
    Rezervavimas findByNumerisSarase(int numerisSarase);
    List<Rezervavimas> findAllByVartotojoKodas(int vartotojoKodas);
    Rezervavimas findRezervavimasByRenginioKodasAndVartotojoKodas(int renginioKodas, int vartotojoKodas);
    void deleteRezervavimasByRezervavimoNumeris(int rezervavimoNumeris);
    List<Rezervavimas> findAllByRenginioKodas(int renginioKodas);
    void deleteAllByRenginioKodas(int renginioKodas);
}
