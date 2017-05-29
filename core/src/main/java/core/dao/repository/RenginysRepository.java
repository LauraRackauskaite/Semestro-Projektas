package core.dao.repository;
import core.model.Renginys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
public interface RenginysRepository extends JpaRepository<Renginys, Integer>{
    Renginys findByPavadinimas(String renginioPavadinimas);
    Renginys findRenginysByRenginioKodas(int renginioKodas);
    List<Renginys> findAllByOrganizatoriausKodas(int organizatoriausKodas);
    void deleteByRenginioKodas(int renginioKodas);
    @Modifying
    @Query("update Renginys u set u.renginioBusenosKodas = ?1 where u.renginioKodas = ?2")
    void SetRenginysBusena(int busena, int renginioNumeris);
    List<Renginys> findAllByRenginioBusenosKodasAndRenginioKategorijosKodas(int renginioBusenosKodas, int renginioKategorijosKodas);
    List<Renginys> findAllByRenginioBusenosKodas(int renginioBusenosKodas);
}
