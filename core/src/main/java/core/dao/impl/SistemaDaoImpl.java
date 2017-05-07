package core.dao.impl;

import core.dao.SistemaDao;
import core.dao.repository.SistemaRepository;
import core.model.Sistema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class SistemaDaoImpl implements SistemaDao{
    @Autowired
    private SistemaRepository sistemaRepository;

    @Override
    public List<Sistema> findAll(){
        List<Sistema> auto = sistemaRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            Sistema a = auto.get(i);

        }
        return auto;
    }
    @Override
    public Sistema findByPagrindineNustatymoReiksme(String pagrindineNustatymoReiksme){
        return sistemaRepository.findByPagrindineNustatymoReiksme(pagrindineNustatymoReiksme);
    }

}
