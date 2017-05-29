package core.dao;

import core.model.Renginys;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface RenginysDao {
    List<Renginys> findAll();
    Renginys findByPavadinimas(String renginioPavadinimas);
    Renginys findRenginysByRenginioKodas(int renginioKodas);
    void saveAndFlush(Renginys renginys);
    List<Renginys> findAllByOrganizatoriausKodas(int organizatoriausKodas);
    void renginysDelete(Renginys renginys);
    void deleteByRenginioKodas(int renginioKodas);
    void SetRenginysBusena(int busena, int renginioNumeris);
    List<Renginys> findAllByRenginioBusenosKodasAndRenginioKategorijosKodas(int renginioBusenosKodas, int renginioKategorijosKodas);
    List<Renginys> findAllByRenginioBusenosKodas(int renginioBusenosKodas);
}
