package core.dao.impl;

import core.dao.VartotojoTipasDao;
import core.dao.repository.VartotojoTipasRepository;
import core.model.VartotojoTipas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class VartotojoTipasDaoImpl implements VartotojoTipasDao{
    @Autowired
    private VartotojoTipasRepository vartotojoTipasRepository;

    @Override
    public List<VartotojoTipas> findAll(){
        List<VartotojoTipas> auto = vartotojoTipasRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            VartotojoTipas a = auto.get(i);

        }
        return auto;
    }
    @Override
    public VartotojoTipas findByTipas(String pavadinimas){
        return vartotojoTipasRepository.findByTipas(pavadinimas);
    }
}
