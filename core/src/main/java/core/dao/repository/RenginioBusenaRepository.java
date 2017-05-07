package core.dao.repository;
import core.model.RenginioBusena;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-04.
 */
public interface RenginioBusenaRepository extends JpaRepository<RenginioBusena, Integer>{
    RenginioBusena findByPavadinimas( String pavadinimas);
}
