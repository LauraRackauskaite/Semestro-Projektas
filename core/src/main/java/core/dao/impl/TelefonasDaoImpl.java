package core.dao.impl;


import core.dao.TelefonasDao;
import core.dao.repository.TelefonasRepository;
import core.model.Telefonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class TelefonasDaoImpl implements TelefonasDao{
    @Autowired
    private TelefonasRepository telefonasRepository;
    @Override
    public List<Telefonas> findAll(){
        List<Telefonas> auto = telefonasRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            Telefonas a = auto.get(i);

        }
        return auto;
    }
    @Override
    public  Telefonas findByVartotojoKodas(String vartotojoKodas){
        return telefonasRepository.findByVartotojoKodas(vartotojoKodas);
    }
}
