package core.dao.repository;
import core.model.Priminimas;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-04.
 */
public interface PriminimasRepository  extends JpaRepository<Priminimas, Integer> {
    Priminimas findByRezervavimoKodas(int rezervavimoKodas);
}
