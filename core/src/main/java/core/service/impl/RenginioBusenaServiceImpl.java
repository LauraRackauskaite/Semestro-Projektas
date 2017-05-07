package core.service.impl;
import core.dao.RenginioBusenaDao;
import core.model.RenginioBusena;
import core.service.RenginioBusenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class RenginioBusenaServiceImpl implements RenginioBusenaService{
    @Autowired
    private RenginioBusenaDao renginioBusenaDao;

    @Override
    public List<RenginioBusena> findAllRenginioBusena() {
        return renginioBusenaDao.findAll();
    }
}
