package core.service.impl;
import core.dao.PriminimasDao;
import core.model.Priminimas;
import core.service.PriminimasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class PriminimasServiceImpl implements PriminimasService{
    @Autowired
    private PriminimasDao priminimasDao;

    @Override
    public List<Priminimas> findAllPriminimas(){
        return priminimasDao.findAll();
    }
}
