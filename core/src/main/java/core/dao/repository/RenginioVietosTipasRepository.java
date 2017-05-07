package core.dao.repository;
import core.model.RenginioVietosTipas;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-04.
 */
public interface RenginioVietosTipasRepository extends JpaRepository<RenginioVietosTipas, Integer>{
    RenginioVietosTipas findByPavadinimas(String pavadinimas);
}
