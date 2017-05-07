package core.dao.repository;
import core.model.Vieta;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-04.
 */
public interface VietaRepository extends JpaRepository<Vieta, Integer>{
    Vieta findByGatvesPavadinimasAndMiestas(String gatvesPavadinimas, String miestas);
}
