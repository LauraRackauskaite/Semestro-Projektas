package core.service.impl;
import core.dao.VartotojoTipasDao;
import core.model.VartotojoTipas;
import core.service.VartotojoTipasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class VartotojoTipasServiceImpl implements VartotojoTipasService{

    @Autowired
    private VartotojoTipasDao vartotojoTipasDao;

    @Override
    public List<VartotojoTipas> findAllVartotojoTipas() {
        return vartotojoTipasDao.findAll();
    }
}
