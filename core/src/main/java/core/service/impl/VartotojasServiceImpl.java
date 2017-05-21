package core.service.impl;
import core.dao.VartotojasDao;
import core.model.Vartotojas;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class VartotojasServiceImpl implements VartotojasService{

    @Autowired
    private VartotojasDao vartotojasDao;

    @Override
    public List<Vartotojas> findAllVartotojas() {
        return vartotojasDao.findAll();
    }

    @Override
    public Vartotojas tikrintiIvestusDuomenis(String epastas, String slaptazodis) {
        return vartotojasDao.findByEpastasAndSlaptazodis(epastas, slaptazodis);
    }
    @Override
    public void registruotiNaujaVartotoja(int tipas, String vardas, String pavarde, int lytis,
                                          String adresas, String ePastas, String slaptazodis){
        Date siandien = new Date();
        Vartotojas naujas = new Vartotojas();
        naujas.setVardas(vardas);
        naujas.setPavarde(pavarde);
        naujas.setAdresas(adresas);
        naujas.setePastas(ePastas);
        naujas.setLytis(lytis);
        naujas.setVartotojoTipoKodas(tipas);
        naujas.setSlaptazodis(slaptazodis);
        naujas.setArAktyvus(1);
        naujas.setSukurimoData(siandien);
        vartotojasDao.registruotiNaujaVartotoja(naujas);
    }
    @Override
    public Vartotojas findByEpastas(String epastas){
        return vartotojasDao.findByEPastas(epastas);
    }
    @Override
    public Vartotojas tikrintiRegistruojamaAsmeni(String epastas, String slaptazodis){
        return vartotojasDao.findByEpastasOrSlaptazodis(epastas, slaptazodis);
    }
    @Override
    public Vartotojas redaguotiAsmensVarda(int id, String naujas){
        Vartotojas redaguojamas = vartotojasDao.findByVartotojoKodas(id);
        redaguojamas.setVardas(naujas);
    return redaguojamas;
    }
    @Override
    public Vartotojas redaguotiAsmensPavarde(int id, String naujas){
        Vartotojas redaguojamas = vartotojasDao.findByVartotojoKodas(id);
        redaguojamas.setPavarde(naujas);
        return redaguojamas;
    }
    @Override
    public Vartotojas redaguotiAsmensAdresa(int id, String naujas){
        Vartotojas redaguojamas = vartotojasDao.findByVartotojoKodas(id);
        redaguojamas.setAdresas(naujas);
        return redaguojamas;
    }
    @Override
    public Vartotojas istrintiVartotoja(Vartotojas vartotojas)
    {
        int id  = vartotojas.getVartotojoKodas();
        vartotojasDao.deleteVartotojasByVartotojoKodas(id);
        return null;
    }
}

