package core.service.impl;
import core.dao.TelefonasDao;
import core.model.Telefonas;
import core.service.TelefonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class TelefonasServiceImpl implements TelefonasService{

    @Autowired
    private TelefonasDao telefonasDao;

    @Override
    public List<Telefonas> findAllTelefonas() {
        return telefonasDao.findAll();
    }
}
