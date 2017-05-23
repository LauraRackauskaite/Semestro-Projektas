package core.dao.impl;

import core.dao.AtsiliepimasDao;
import core.dao.repository.AtsiliepimasRepository;
import core.model.Atsiliepimas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AtsiliepimasDaoImpl implements AtsiliepimasDao{
    @Autowired
    private AtsiliepimasRepository atsiliepimasRepository;

    @Override
    public List<Atsiliepimas> findAll(){
        List<Atsiliepimas> auto = atsiliepimasRepository.findAll();
        for(int i = 0; i < auto.size(); i++)
        {
            Atsiliepimas a = auto.get(i);

        }
        return auto;
    }

    @Override
    public Atsiliepimas findByRenginioKodasAndVartotojoKodas(int renginioKodas, int VartotojoKodas){
        return atsiliepimasRepository.findByRenginioKodasAndVartotojoKodas(renginioKodas, VartotojoKodas);
    }

}
