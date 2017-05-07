package core.dao.impl;

import core.dao.RezervacijaDao;

import core.dao.repository.RezervavimasRepository;
import core.model.Rezervavimas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class RezervacijaDaoImpl implements RezervacijaDao{
    @Autowired
    private RezervavimasRepository rezervavimasRepository;

    @Override
    public List<Rezervavimas> findAll() {
        List<Rezervavimas> auto = rezervavimasRepository.findAll();
        for (int i = 0; i < auto.size(); i++) {
            Rezervavimas a = auto.get(i);

        }
        return auto;
    }
    @Override
    public Rezervavimas findByNumerisSarase(int numerisSarase){
        return rezervavimasRepository.findByNumerisSarase(numerisSarase);
    }
}
