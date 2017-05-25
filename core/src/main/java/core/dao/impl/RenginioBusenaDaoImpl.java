package core.dao.impl;

import core.dao.RenginioBusenaDao;
import core.dao.repository.RenginioBusenaRepository;
import core.model.RenginioBusena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class RenginioBusenaDaoImpl implements RenginioBusenaDao{
    @Autowired
    private RenginioBusenaRepository renginioBusenaRepository;

    @Override
    public List<RenginioBusena> findAll(){
        List<RenginioBusena> auto = renginioBusenaRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            RenginioBusena a = auto.get(i);

        }
        return auto;
    }
    @Override
    public RenginioBusena findByBusenosPavadinimas(String pavadinimas){
      return renginioBusenaRepository.findByPavadinimas(pavadinimas);
    }
    @Override
   public RenginioBusena findRenginioBusenaByRenginioBusenosNumeris(int renginioBusenosNumeris){
        return renginioBusenaRepository.findRenginioBusenaByRenginioBusenosNumeris(renginioBusenosNumeris);
    }
}
