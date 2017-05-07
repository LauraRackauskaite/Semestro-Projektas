package core.service.impl;
import core.dao.AtsiliepimasDao;
import core.model.Atsiliepimas;
import core.service.AtsiliepimasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class AtsiliepimasServiceImpl implements AtsiliepimasService{
    @Autowired
    private AtsiliepimasDao atsiliepimasDao;

    @Override
    public List<Atsiliepimas> findAllAtsiliepimas(){
        return atsiliepimasDao.findAll();
    }
}
