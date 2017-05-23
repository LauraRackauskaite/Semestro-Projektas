package core.service.impl;
import core.dao.*;
import core.model.*;
import core.service.VartotojasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    @Autowired
    private VartotojoTipasDao vartotojoTipasDao;

    @Autowired
    private RezervacijaDao rezervacijaDao;

    @Autowired
    private RenginysDao renginysDao;
    @Autowired
    private RenginioKategorijaDao renginioKategorijaDao;
    @Autowired
    private RenginioVietosTipasDao renginioVietosTipasDao;
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
    @Override
    public List<Vartotojas> GetAllVartotojasAtaskaita()
    {

        return vartotojasDao.findAll();
    }
    @Override
    public List<String> GetAllEsamuVartotojuTipus(){
        List<VartotojoTipas> vTipai = vartotojoTipasDao.findAll();
        List<Vartotojas> vartotojai = vartotojasDao.findAll();
        List<String>  susietiTipai = new ArrayList<String>();
        for (int i = 0; i < vartotojai.size(); i++)
            for(int j = 0; j < vTipai.size(); j++)
                if(vartotojai.get(i).getVartotojoTipoKodas() == vTipai.get(j).getVartotojoTipoNumeris())
                    susietiTipai.add(vTipai.get(j).getTipas());
        return susietiTipai;
    }

    @Override
    public List<String> GetAllEsamuLytis(){
        List<Vartotojas> vartotojai = vartotojasDao.findAll();
        List<String>  susietosLytis = new ArrayList<String>();
        for (int i = 0; i < vartotojai.size(); i++)
            if(vartotojai.get(i).getLytis() == 1)
                susietosLytis.add("vyras");
        else
                susietosLytis.add("moteris");
        return susietosLytis;
    }
    @Override
    public List<Integer> GetAllEsamuRezervacijas() {
        List<Vartotojas> vartotojai = vartotojasDao.findAll();
        List<Rezervavimas> rezervavimas = rezervacijaDao.findAll();
        List<Integer> esamuRezervavimuSkaiciai = new ArrayList<Integer>();
        for(int i = 0; i < vartotojai.size(); i++) {
            int suma = 0;
            for (int j = 0; j < rezervavimas.size(); j++)
                if(vartotojai.get(i).getVartotojoKodas() == rezervavimas.get(j).getVartotojoKodas())
                    suma++;
            esamuRezervavimuSkaiciai.add(suma);
        }
        return esamuRezervavimuSkaiciai;
    }

    @Override
    public Integer SkaicuotiAsmenis(int tipoKodas){
    return vartotojasDao.countVartotojasByVartotojoTipoKodas(tipoKodas);
    }
    @Override
    public Integer SkaicuotiVisasRezervacijas(){
        return  rezervacijaDao.findAll().size();
    }
    @Override
    public List<Renginys> gautiVartotojoRenginius(int vartotojoKodas) {
        List<Rezervavimas> gautiRezervavimus = rezervacijaDao.findAllByVartotojoKodas(vartotojoKodas);
        List<Renginys> gautiVisusRenginius = renginysDao.findAll();
        List<Renginys> gautiAtrinktusRenginus = new ArrayList<Renginys>();
        for(int i = 0; i < gautiRezervavimus.size(); i++)
            gautiAtrinktusRenginus.add(renginysDao.findRenginysByRenginioKodas(gautiRezervavimus.get(i).getRenginioKodas()));
        return gautiAtrinktusRenginus;
    }
    @Override
    public List<String> gautiVartotojoKategorijasRenginius(int vartotojoKodas){
        List<Rezervavimas> gautiRezervavimus = rezervacijaDao.findAllByVartotojoKodas(vartotojoKodas);
        List<Renginys> gautiVisusRenginius = renginysDao.findAll();
        List<Renginys> gautiAtrinktusRenginus = new ArrayList<Renginys>();
        List<String> gautiAtrinktasKategorijas = new ArrayList<String>();
        for(int i = 0; i < gautiRezervavimus.size(); i++)
            gautiAtrinktusRenginus.add(renginysDao.findRenginysByRenginioKodas(gautiRezervavimus.get(i).getRenginioKodas()));
        for(int i = 0; i < gautiAtrinktusRenginus.size(); i++)
            gautiAtrinktasKategorijas.add(renginioKategorijaDao.
                    findRenginioKategorijaByRenginioKategorijosNumeris(gautiAtrinktusRenginus.get(i).
                            getRenginioKategorijosKodas()).
                    getPavadinimas());
        return gautiAtrinktasKategorijas;
    }

    @Override
    public List<String> gautiVartotojovietasRenginiuose(int vartotojoKodas){
        List<Rezervavimas> gautiRezervavimus = rezervacijaDao.findAllByVartotojoKodas(vartotojoKodas);
        List<Renginys> gautiVisusRenginius = renginysDao.findAll();
        List<Renginys> gautiAtrinktusRenginus = new ArrayList<Renginys>();
        List<String> gautiAtrinktasKategorijas = new ArrayList<String>();
        for(int i = 0; i < gautiRezervavimus.size(); i++)
            gautiAtrinktusRenginus.add(renginysDao.findRenginysByRenginioKodas(gautiRezervavimus.get(i).getRenginioKodas()));
        for(int i = 0; i < gautiAtrinktusRenginus.size(); i++)
        {}
        return gautiAtrinktasKategorijas;
    }

}

