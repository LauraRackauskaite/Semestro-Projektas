package core.dao.repository;
import core.model.RenginioKategorija;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by daini on 2017-05-04.
 */
public interface RenginioKategorijaRepository extends JpaRepository<RenginioKategorija, Integer>{
    RenginioKategorija findByPavadinimas(String pavadinimas);
    RenginioKategorija findRenginioKategorijaByRenginioKategorijosNumeris(int renginioKategorijosNumeris);
}
