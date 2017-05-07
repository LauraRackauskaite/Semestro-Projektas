package core.dao.impl;

import core.dao.VartotojasDao;
import core.dao.repository.VartotojasRepository;
import core.model.Vartotojas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
@Repository
public class VartotojasDaoImpl implements VartotojasDao{
    @Autowired
    private VartotojasRepository vartotojasRepository;
    @Override
    public List<Vartotojas> findAll(){
        List<Vartotojas> auto = vartotojasRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            Vartotojas a = auto.get(i);

        }
        return auto;
    }
    public Vartotojas findByVardasAndPavarde(String vardas, String pavarde){
        return vartotojasRepository.findByVardasAndPavarde(vardas, pavarde);
    }
    public Vartotojas findByEpastasAndSlaptazodis(String ePastas, String slaptazodis)
    {
       return vartotojasRepository.findByEPastasAndSlaptazodis(ePastas,slaptazodis);
    }

}
