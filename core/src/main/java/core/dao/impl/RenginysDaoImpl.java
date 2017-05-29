package core.dao.impl;

import core.dao.RenginysDao;

import core.dao.repository.RenginysRepository;
import core.model.Renginys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class RenginysDaoImpl implements RenginysDao {
    @Autowired
    private RenginysRepository renginysRepository;

    @Override
    public List<Renginys> findAll(){
        List<Renginys> auto = renginysRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            Renginys a = auto.get(i);

        }
        return auto;
    }
    @Override
    public Renginys findByPavadinimas(String renginioPavadinimas){
        return renginysRepository.findByPavadinimas(renginioPavadinimas);
    }
    @Override
    public Renginys findRenginysByRenginioKodas(int renginioKodas){
        return renginysRepository.findRenginysByRenginioKodas(renginioKodas);
    }
    @Override
    public void saveAndFlush(Renginys renginys){
         renginysRepository.saveAndFlush(renginys);
    }
    @Override
    public  List<Renginys> findAllByOrganizatoriausKodas(int organizatoriausKodas){
        return renginysRepository.findAllByOrganizatoriausKodas(organizatoriausKodas);
    }
    @Override
    public void renginysDelete(Renginys renginys){

        renginysRepository.delete(renginys.getRenginioKodas());
    }
    @Override
    public void deleteByRenginioKodas(int renginioKodas){
        renginysRepository.deleteByRenginioKodas(renginioKodas);
    }
    @Override
    public void SetRenginysBusena(int busena, int renginioNumeris){
        renginysRepository.SetRenginysBusena(busena, renginioNumeris);
    }
    @Override
   public List<Renginys> findAllByRenginioBusenosKodasAndRenginioKategorijosKodas(int renginioBusenosKodas,
                                                                                  int renginioKategorijosKodas){
        return renginysRepository.findAllByRenginioBusenosKodasAndRenginioKategorijosKodas(renginioBusenosKodas, renginioKategorijosKodas);
    }
    @Override
    public List<Renginys> findAllByRenginioBusenosKodas(int renginioBusenosKodas){
       return renginysRepository.findAllByRenginioBusenosKodas(renginioBusenosKodas);
    }

}
