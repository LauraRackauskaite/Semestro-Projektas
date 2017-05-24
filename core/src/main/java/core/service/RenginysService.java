package core.service;
import core.model.Renginys;
import core.model.Vieta;

import java.util.List;
/**
 * Created by daini on 2017-05-03.
 */
public interface RenginysService {
    List<Renginys> findAllRenginys();
    List<String> gautiVisasRenginiuKategorijas();
    List<String> gautiVisasRenginiuTipuVietas();
    List<Vieta> gautiVisasEsamasVietas();
    void RezervuotisVieta(int renginioIndeksas, int vartotojoindeksas);
    List<String> gautiMygtukus(int vartotojokodas);
    List<String> gautiIspejimus(int vartotojoKodas);
}
