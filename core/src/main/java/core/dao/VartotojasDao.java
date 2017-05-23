package core.dao;

import core.model.Vartotojas;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface VartotojasDao {
    List<Vartotojas> findAll();
    Vartotojas findByVardasAndPavarde(String vardas, String pavarde);
    Vartotojas findByEpastasAndSlaptazodis(String epastas, String slaptazodis);
    Vartotojas findByEPastas(String ePastas);
    void registruotiNaujaVartotoja(Vartotojas vartotojas);
    Vartotojas findByEpastasOrSlaptazodis(String epastas, String slaptazodis);
    Vartotojas findByVartotojoKodas(int id);
    Vartotojas deleteVartotojasByVartotojoKodas(int id);
    Integer countVartotojasByVartotojoTipoKodas(int n);
}

