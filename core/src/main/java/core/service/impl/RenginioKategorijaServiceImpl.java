package core.service.impl;
import core.dao.RenginioKategorijaDao;
import core.dao.RenginioVietosTipasDao;
import core.dao.RenginysDao;
import core.dao.VietaDao;
import core.model.RenginioKategorija;
import core.model.RenginioVietosTipas;
import core.model.Renginys;
import core.model.Vieta;
import core.service.RenginioKategorijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
@Service
@Transactional
public class RenginioKategorijaServiceImpl implements RenginioKategorijaService{
    @Autowired
    private RenginioKategorijaDao renginioKategorijaDao;
    @Autowired
    private RenginioVietosTipasDao renginioVietosTipas;
    @Autowired
    private VietaDao vietaDao;
    @Autowired
    private RenginysDao renginysDao;

    @Override
    public List<RenginioKategorija> findAllRenginioKategorija() {
        return renginioKategorijaDao.findAll();
    }
    @Override
    public List<RenginioVietosTipas> findAllRenginioVietosTipas(){
        return renginioVietosTipas.findAll();
    }
    @Override
    public void CreateEvent( int kategory,
                             String pavadinimas,
                             String trumpasAprasymas,  String renginioData,
                             String renginioLaikas,  String renginioTrukme,
                             int tip,  String gatve,  String miestas,
                             int namNumeris, int organizatoriausKodas, int dalyviuSk){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date data = new Date();
        try {
            data = df.parse(renginioData);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        DateFormat dl = new SimpleDateFormat("hh-mm");
        Date laikas = new Date();
        try {
            laikas = dl.parse(renginioLaikas);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }

        Date trukme = new Date();
        try {
            trukme = dl.parse(renginioTrukme);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }

        Vieta vieta = new Vieta();
        vieta.setGatvesPavadinimas(gatve);
        vieta.setNamoNumeris(namNumeris);
        vieta.setMiestas(miestas);
        vietaDao.saveAndFlush(vieta);
        Vieta einama = vietaDao.findByGatvesPavadinimasAndMiestas(gatve, miestas);


        Renginys renginys = new Renginys();
            renginys.setPavadinimas(pavadinimas);
            renginys.setTrumpasAprasymas(trumpasAprasymas);
            renginys.setRenginioKategorijosKodas(kategory);
            renginys.setRenginioBusenosKodas(1);
            renginys.setRenginioData(data);
            renginys.setRenginioLaikas(laikas);
            renginys.setRenginioTrukme(trukme);
            renginys.setRenginioTipoKodas(tip);
            renginys.setRenginioVietosKodas(einama.getVietosNumeris());
            renginys.setOrganizatoriausKodas(organizatoriausKodas);
            renginys.setDalyviuKiekis(dalyviuSk);
            renginysDao.saveAndFlush(renginys);
    }
    @Override
    public RenginioKategorija findRenginioKategorijaByRenginioKategorijosNumeris(int numeris){

        return renginioKategorijaDao.findRenginioKategorijaByRenginioKategorijosNumeris(numeris);
    }


}
