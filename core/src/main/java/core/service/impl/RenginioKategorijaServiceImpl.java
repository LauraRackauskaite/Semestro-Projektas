package core.service.impl;
import core.dao.RenginioKategorijaDao;
import core.model.RenginioKategorija;
import core.service.RenginioKategorijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class RenginioKategorijaServiceImpl implements RenginioKategorijaService{
    @Autowired
    private RenginioKategorijaDao renginioKategorijaDao;

    @Override
    public List<RenginioKategorija> findAllRenginioKategorija() {
        return renginioKategorijaDao.findAll();
    }
}