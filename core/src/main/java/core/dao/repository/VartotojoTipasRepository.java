package core.dao.repository;
import core.model.VartotojoTipas;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-04.
 */
public interface VartotojoTipasRepository extends JpaRepository<VartotojoTipas, Integer>{
    VartotojoTipas findByTipas(String pavadinimas);
}
