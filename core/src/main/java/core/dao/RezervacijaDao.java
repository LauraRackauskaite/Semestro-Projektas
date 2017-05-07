package core.dao;

import core.model.Rezervavimas;

import java.util.List;

/**
 * Created by daini on 2017-05-03.
 */
public interface RezervacijaDao {
    List<Rezervavimas> findAll();
   Rezervavimas findByNumerisSarase(int numerisSarase);
}
