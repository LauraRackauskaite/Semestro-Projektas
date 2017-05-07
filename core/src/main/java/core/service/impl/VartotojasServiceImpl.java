package core.service.impl;
import core.dao.VartotojasDao;
import core.model.Vartotojas;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class VartotojasServiceImpl implements VartotojasService{

    @Autowired
    private VartotojasDao vartotojasDao;

    @Override
    public List<Vartotojas> findAllVartotojas() {
        return vartotojasDao.findAll();
    }

    @Override
    public Vartotojas tikrintiIvestusDuomenis(String epastas, String slaptazodis) {
            return vartotojasDao.findByEpastasAndSlaptazodis(epastas, slaptazodis);
    }
}

