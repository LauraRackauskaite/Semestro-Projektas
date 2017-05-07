package core.dao.repository;
import core.model.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-04.
 */
public interface SistemaRepository extends JpaRepository<Sistema, Integer>{
    Sistema findByPagrindineNustatymoReiksme(String pagrindineNustatymoReiksme);
}
