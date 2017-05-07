package core.dao.impl;

import core.dao.PriminimasDao;
import core.dao.repository.PriminimasRepository;
import core.model.Priminimas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class PriminimasDaoImpl implements PriminimasDao{
    @Autowired
    private PriminimasRepository priminimasRepository;

    @Override
    public List<Priminimas> findAll(){
        List<Priminimas> auto = priminimasRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            Priminimas a = auto.get(i);

        }
        return auto;
    }
    @Override
    public  Priminimas findByRezervavimoKodas(int rezervavimoKodas){
        return priminimasRepository.findByRezervavimoKodas(rezervavimoKodas);
    }
}
