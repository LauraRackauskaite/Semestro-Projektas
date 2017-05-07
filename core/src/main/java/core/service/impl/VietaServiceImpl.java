package core.service.impl;
import core.dao.VietaDao;
import core.model.Vieta;
import core.service.VietaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class VietaServiceImpl implements VietaService{

    @Autowired
    private VietaDao vietaDao;

    @Override
    public List<Vieta> findAllVieta() {
        return vietaDao.findAll();
    }
}
