package core.dao.impl;

import core.dao.RezervavimoTrukmeDao;

import core.dao.repository.RezervavimoTrukmeRepository;
import core.model.RezervavimoTrukme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class RezervavimoTrukmeDaoImpl implements RezervavimoTrukmeDao{
    @Autowired
    private RezervavimoTrukmeRepository rezervavimoTrukmeRepository;

    @Override
    public List<RezervavimoTrukme> findAll(){
        List<RezervavimoTrukme> auto = rezervavimoTrukmeRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            RezervavimoTrukme a = auto.get(i);

        }
        return auto;
    }
    @Override
    public RezervavimoTrukme findByLaikasNuoAndLaikasIki(Date laikasNuo, Date laikasIki){
        return rezervavimoTrukmeRepository.findByLaikasNuoAndLaikasIki(laikasNuo, laikasIki);
    }
}
