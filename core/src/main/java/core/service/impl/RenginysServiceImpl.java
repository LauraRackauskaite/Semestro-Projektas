package core.service.impl;
import core.dao.*;
import core.model.RenginioBusena;
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
    @Autowired
    private RenginioBusenaDao renginioBusenaDao;
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

    @Override
    public List<Renginys> findAllOrganizatoriausRenginiai(int organizatoriausKodas){
      return renginysDao.findAllByOrganizatoriausKodas(organizatoriausKodas);
    }

    @Override
    public List<String> findAllOrganizatoriausKategorijos(int organizatoriausKodas){
        List<Renginys> visosKategorijos = renginysDao.findAllByOrganizatoriausKodas(organizatoriausKodas);
       List<String> atrinktosKategorijos = new ArrayList<String>();
        for(int i = 0; i < visosKategorijos.size(); i++)
            atrinktosKategorijos.add(renginioKategorijaDao.
                    findRenginioKategorijaByRenginioKategorijosNumeris(visosKategorijos.get(i).
                            getRenginioKategorijosKodas()).getPavadinimas());
        return atrinktosKategorijos;
    }
    @Override
    public List<String> findAllOrganizatoriausVietosTipai(int organizatoriausKodas)
    {
        List<Renginys> visosKategorijos = renginysDao.findAllByOrganizatoriausKodas(organizatoriausKodas);
        List<String> atrinktiVietosTipai= new ArrayList<String>();
        for(int i = 0; i < visosKategorijos.size(); i++)
            atrinktiVietosTipai.add(renginioVietosTipasDao.findRenginioVietosTipasByVietosTipoNumeris(visosKategorijos.
                    get(i).getRenginioTipoKodas()).getPavadinimas());
    return atrinktiVietosTipai;
    }
    @Override
    public List<Vieta> findAllOrganizatoriausVietos(int organizatoriausKodas){
        List<Renginys> visosKategorijos = renginysDao.findAllByOrganizatoriausKodas(organizatoriausKodas);
        List<Vieta> atrinktosVietos = new ArrayList<Vieta>();
        for(int i = 0; i < visosKategorijos.size(); i++)
            atrinktosVietos.add(vietaDao.findVietaByVietosNumeris(visosKategorijos.get(i).getRenginioVietosKodas()));
        return atrinktosVietos;
    }
    @Override
    public List<String> findAllOrganizatoriausBusenas(int organizatoriausKodas){
        List<Renginys> visosKategorijos = renginysDao.findAllByOrganizatoriausKodas(organizatoriausKodas);
        List<String> atrinktosBusenos = new ArrayList<String>();
        for(int i = 0; i < visosKategorijos.size(); i++)
            atrinktosBusenos.add(renginioBusenaDao.findRenginioBusenaByRenginioBusenosNumeris(visosKategorijos.get(i).
                    getRenginioBusenosKodas()).getPavadinimas());
        return atrinktosBusenos;
    }
    @Override
    public void pasalintiOrganizatoriausRengini(int renginioIndeksas, int vartotojoKodas){
       rezervacijaDao.deleteAllByRenginioKodas(renginioIndeksas);
    }
    @Override
    public Renginys findRenginysByRenginioKodas(int renginioKodas){
       return renginysDao.findRenginysByRenginioKodas(renginioKodas);
    }
}

