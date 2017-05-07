package core.service.impl;
import core.dao.RenginysDao;
import core.model.Renginys;
import core.service.RenginysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class RenginysServiceImpl implements RenginysService{

    @Autowired
    private RenginysDao renginysDao;

    @Override
    public List<Renginys> findAllRenginys() {
        return renginysDao.findAll();
    }
}

