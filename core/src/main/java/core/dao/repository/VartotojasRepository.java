package core.dao.repository;
import core.model.Vartotojas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by daini on 2017-05-04.
 */
public interface VartotojasRepository extends JpaRepository<Vartotojas, Integer>{
    Vartotojas findByVardasAndPavarde(String vardas, String pavarde);
    Vartotojas findByEPastasAndSlaptazodis(String ePastas, String slaptazodis);
    Vartotojas findByEPastas(String ePastas);
    Vartotojas findByEPastasOrSlaptazodis(String ePastas, String slaptazodis);
    Vartotojas findByVartotojoKodas(int vartotojoKodas);
    void deleteVartotojasByVartotojoKodas(int vartotojoKodas);
    List<Vartotojas> findAll();
    Integer countVartotojasByVartotojoTipoKodas(int vartotojoTipoKodas);
}
