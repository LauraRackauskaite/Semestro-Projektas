package core.model;
import javax.persistence.*;
/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "atsiliepimai")
public class Atsiliepimas {
    @Id
    @Column (name = "atsiliepimo_numeris")
    private int atsiliepimoNumeris;

    @Column (name = "komentaras")
    private String komentaras;

    @Column(name = "renginio_kodas")
    private int renginioKodas;

    @Column (name = "vartotojo_kodas")
    private int vartotojoKodas;

    public int getAtsiliepimoNumeris() {
        return atsiliepimoNumeris;
    }

    public void setAtsiliepimoNumeris(int atsiliepimoNumeris) {
        this.atsiliepimoNumeris = atsiliepimoNumeris;
    }

    public String getKomentaras() {
        return komentaras;
    }

    public void setKomentaras(String komentaras) {
        this.komentaras = komentaras;
    }

    public int getRenginioKodas() {
        return renginioKodas;
    }

    public void setRenginioKodas(int renginioKodas) {
        this.renginioKodas = renginioKodas;
    }

    public int getVartotojoKodas() {
        return vartotojoKodas;
    }

    public void setVartotojoKodas(int vartotojoKodas) {
        this.vartotojoKodas = vartotojoKodas;
    }
}
