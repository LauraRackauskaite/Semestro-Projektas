package core.service.impl;
import core.dao.RenginioVietosTipasDao;
import core.model.RenginioVietosTipas;
import core.service.RenginioVietosTipasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RenginioVietosTipasServiceImpl implements RenginioVietosTipasService{

    @Autowired
    private RenginioVietosTipasDao renginioVietosTipasDao;

    @Override
    public List<RenginioVietosTipas> findAllRenginioVietosTipas() {
        return renginioVietosTipasDao.findAll();
    }

    @Override
    public RenginioVietosTipas findRenginioVietosTipasByVietosTipoNumeris(int vietosTipoNumeris){
        return renginioVietosTipasDao.findRenginioVietosTipasByVietosTipoNumeris(vietosTipoNumeris);
    }
}
