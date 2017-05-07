package core.service.impl;
import core.dao.SistemaDao;
import core.model.Sistema;
import core.service.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class SistemaServiceImpl implements SistemaService{

    @Autowired
    private SistemaDao sistemaDao;

    @Override
    public List<Sistema> findAllSistema() {
        return sistemaDao.findAll();
    }
}
