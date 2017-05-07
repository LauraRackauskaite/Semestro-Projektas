package core.dao.impl;

import core.dao.RenginioKategorijaDao;
import core.dao.repository.RenginioKategorijaRepository;
import core.model.RenginioKategorija;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class RenginioKategorijaDaoImpl implements RenginioKategorijaDao{
    @Autowired
    private RenginioKategorijaRepository renginioKategorijaRepository;

    @Override
    public List<RenginioKategorija> findAll(){
        List<RenginioKategorija> auto = renginioKategorijaRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            RenginioKategorija a = auto.get(i);

        }
        return auto;
    }

    @Override
    public RenginioKategorija findByPavadinimas(String pavadinimas){
        return renginioKategorijaRepository.findByPavadinimas(pavadinimas);
    }
}
