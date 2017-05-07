package core.service.impl;
import core.dao.RezervavimoTrukmeDao;
import core.model.RezervavimoTrukme;
import core.service.RezervavimoTrukmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class RezervavimoTrukmeServiceImpl implements RezervavimoTrukmeService{

    @Autowired
    private RezervavimoTrukmeDao rezervavimoTrukmeDao;

    @Override
    public List<RezervavimoTrukme> findAllRezervavimoTrukme() {
        return rezervavimoTrukmeDao.findAll();
    }
}
