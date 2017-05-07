package core.dao.impl;

import core.dao.RenginioVietosTipasDao;


import core.dao.repository.RenginioVietosTipasRepository;
import core.model.RenginioVietosTipas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class RenginioVietosTipasDaoImpl implements RenginioVietosTipasDao{
    @Autowired
    private RenginioVietosTipasRepository renginioVietosTipasRepository;

    @Override
    public List<RenginioVietosTipas> findAll(){
        List<RenginioVietosTipas> auto = renginioVietosTipasRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            RenginioVietosTipas a = auto.get(i);

        }
        return auto;
    }
    @Override
   public RenginioVietosTipas findByPavadinimas(String pavadinimas){
        return renginioVietosTipasRepository.findByPavadinimas(pavadinimas);
    }
}
