package core.dao.repository;
import core.model.Renginys;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-04.
 */
public interface RenginysRepository extends JpaRepository<Renginys, Integer>{
    Renginys findByPavadinimas(String renginioPavadinimas);
    Renginys findRenginysByRenginioKodas(int renginioKodas);
}
