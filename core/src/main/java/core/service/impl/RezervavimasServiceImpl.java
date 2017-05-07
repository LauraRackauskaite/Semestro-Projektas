package core.service.impl;
import core.dao.RezervacijaDao;
import core.model.Rezervavimas;
import core.service.RezervavimasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class RezervavimasServiceImpl implements RezervavimasService{

    @Autowired
    private RezervacijaDao rezervacijaDao;

    @Override
    public List<Rezervavimas> findAllRezervavimas() {
        return rezervacijaDao.findAll();
    }
}
