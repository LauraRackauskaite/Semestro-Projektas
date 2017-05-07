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
}
