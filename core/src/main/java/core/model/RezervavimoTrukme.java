package core.model;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "rezervavimo_trukmes")
public class RezervavimoTrukme {

    @Id
    @Column (name = "rezervavimo_trukmes_numeris")
    private int rezervavimoTrukmesNumeris;

    @Column (name = "laikas_nuo")
    private Date laikasNuo;


    @Column (name = "laikas_iki")
    private Date laikasIki;

    public int getRezervavimo_trukmes_numeris() {
        return rezervavimoTrukmesNumeris;
    }

    public void setRezervavimo_trukmes_numeris(int rezervavimo_trukmes_numeris) {
        this.rezervavimoTrukmesNumeris = rezervavimo_trukmes_numeris;
    }

    public int getRezervavimoTrukmesNumeris() {
        return rezervavimoTrukmesNumeris;
    }

    public void setRezervavimoTrukmesNumeris(int rezervavimoTrukmesNumeris) {
        this.rezervavimoTrukmesNumeris = rezervavimoTrukmesNumeris;
    }

    public Date getLaikasNuo() {
        return laikasNuo;
    }

    public void setLaikasNuo(Date laikasNuo) {
        this.laikasNuo = laikasNuo;
    }

    public Date getLaikasIki() {
        return laikasIki;
    }

    public void setLaikasIki(Date laikasIki) {
        this.laikasIki = laikasIki;
    }
}
