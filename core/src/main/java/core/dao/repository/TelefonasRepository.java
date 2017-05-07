package core.dao.repository;
import core.model.Telefonas;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-04.
 */
public interface TelefonasRepository extends JpaRepository<Telefonas, Integer>{
    Telefonas findByVartotojoKodas(String vartotojoKodas);
}
