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
        return auto;
    }

    public Vartotojas findByVardasAndPavarde(String vardas, String pavarde){

        return vartotojasRepository.findByVardasAndPavarde(vardas, pavarde);
    }
    public Vartotojas findByEpastasAndSlaptazodis(String ePastas, String slaptazodis)
    {
        return vartotojasRepository.findByEPastasAndSlaptazodis(ePastas,slaptazodis);
    }
    public Vartotojas findByEPastas(String ePastas) {
        return vartotojasRepository.findByEPastas(ePastas);
    }
    public void registruotiNaujaVartotoja(Vartotojas vartotojas) {

        vartotojasRepository.saveAndFlush(vartotojas);
    }
    public Vartotojas findByEpastasOrSlaptazodis(String epastas, String slaptazodis){
        return vartotojasRepository.findByEPastasOrSlaptazodis(epastas, slaptazodis);
    }
    public  Vartotojas findByVartotojoKodas(int id) {
        return vartotojasRepository.findByVartotojoKodas(id);
    }
    public Vartotojas deleteVartotojasByVartotojoKodas(int id) {
        vartotojasRepository.deleteVartotojasByVartotojoKodas(id);
        return  null;
    }
    public Integer countVartotojasByVartotojoTipoKodas(int n){
        return  vartotojasRepository.countVartotojasByVartotojoTipoKodas(n);
    }
}
