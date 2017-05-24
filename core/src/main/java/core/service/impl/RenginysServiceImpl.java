package core.service.impl;
import core.dao.*;
import core.model.Renginys;
import core.model.Rezervavimas;
import core.model.Vieta;
import core.service.RenginysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class RenginysServiceImpl implements RenginysService{

    @Autowired
    private RenginysDao renginysDao;

    @Autowired
    private RenginioKategorijaDao renginioKategorijaDao;
    @Autowired
    private RenginioVietosTipasDao renginioVietosTipasDao;
    @Autowired
    private VietaDao vietaDao;
    @Autowired
    private RezervacijaDao rezervacijaDao;

    @Override
    public List<Renginys> findAllRenginys() {
        return renginysDao.findAll();
    }
    @Override
    public List<String> gautiVisasRenginiuKategorijas(){
        List<Renginys> visiRenginiai = renginysDao.findAll();
        List<String> visosEsamosKategorijos = new ArrayList<String>();
        for(int i = 0; i < visiRenginiai.size(); i++)
            visosEsamosKategorijos.
                    add(renginioKategorijaDao.
                            findRenginioKategorijaByRenginioKategorijosNumeris(visiRenginiai.
                                    get(i).
                                    getRenginioKategorijosKodas()).
                            getPavadinimas());
        return visosEsamosKategorijos;
    }
    @Override
    public List<String> gautiVisasRenginiuTipuVietas(){
        List<Renginys> visiRenginiai = renginysDao.findAll();
        List<String> visuEsamuVietuTipai = new ArrayList<String>();
        for(int i = 0; i < visiRenginiai.size(); i++)
            visuEsamuVietuTipai.add(renginioVietosTipasDao.
                    findRenginioVietosTipasByVietosTipoNumeris(visiRenginiai.
                            get(i).getRenginioTipoKodas()).getPavadinimas());
        return visuEsamuVietuTipai;
    }
    @Override
    public List<Vieta> gautiVisasEsamasVietas(){
        List<Renginys> visiRenginiai = renginysDao.findAll();
        List<Vieta> visosEsamosVietos = new ArrayList<Vieta>();
        for(int i = 0; i < visiRenginiai.size(); i++)
            visosEsamosVietos.add(vietaDao.findVietaByVietosNumeris(visiRenginiai.get(i).getRenginioVietosKodas()));
        return visosEsamosVietos;
    }
    @Override
    public void RezervuotisVieta(int renginioIndeksas, int vartotojoindeksas){
        Rezervavimas rezervavimas = new Rezervavimas();
        rezervavimas.setRenginioKodas(renginioIndeksas);
        rezervavimas.setVartotojoKodas(vartotojoindeksas);
        List<Rezervavimas> RenginioDalyviai = rezervacijaDao.findAllByRenginioKodas(renginioIndeksas);
        int kiekis = RenginioDalyviai.size();
        rezervavimas.setNumerisSarase(++kiekis);
        Date date = new Date();
        rezervavimas.setRezervavimoData(date);
        rezervacijaDao.saveAndFlushRezervavimas(rezervavimas);
    }
    @Override
    public List<String> gautiMygtukus(int vartotojokodas){
        List<String> gautiMygtukus = new ArrayList<String>();
        List<Renginys> visiRenginiai = renginysDao.findAll();
        for(int i = 0; i < visiRenginiai.size(); i++) {
            Rezervavimas rezervavimas = rezervacijaDao.findRezervavimasByRenginioKodasAndVartotojoKodas(visiRenginiai.get(i).
                    getRenginioKodas(), vartotojokodas);
            if(rezervavimas == null)
                gautiMygtukus.add("");
            else
                gautiMygtukus.add("disabled");
        }
        return gautiMygtukus;
    }
    @Override
   public List<String> gautiIspejimus(int vartotojoKodas){
        List<String> gautiIspejimus = new ArrayList<String>();
        List<Renginys> visiRenginiai = renginysDao.findAll();
        for(int i = 0; i < visiRenginiai.size(); i++) {
            Rezervavimas rezervavimas = rezervacijaDao.findRezervavimasByRenginioKodasAndVartotojoKodas(visiRenginiai.
                    get(i).getRenginioKodas(), vartotojoKodas);
            if(rezervavimas == null)
                gautiIspejimus.add("");
            else
                gautiIspejimus.add("Užrezervuota");
        }
        return gautiIspejimus;
    }
}

