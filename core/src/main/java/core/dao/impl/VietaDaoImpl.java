package core.dao.impl;

import core.dao.VietaDao;
import core.dao.repository.VietaRepository;
import core.model.Vieta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class VietaDaoImpl implements VietaDao{
    @Autowired
    private VietaRepository vietaRepository;
    @Override
    public List<Vieta> findAll(){
        List<Vieta> auto = vietaRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            Vieta a = auto.get(i);

        }
        return auto;
    }
    @Override
    public Vieta findByGatvesPavadinimasAndMiestas(String gatvesPavadinimas, String miestas){
    return vietaRepository.findByGatvesPavadinimasAndMiestas(gatvesPavadinimas, miestas);
    }
}
