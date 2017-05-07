package core.model;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "rezervavimai")
public class Rezervavimas {
    @Id
    @Column (name = "rezervavimo_numeris")
    private int rezervavimoNumeris;

    @Column (name = "rezervavimo_data")
    private Date rezervavimoData;

    @Column (name = "numeris_sarase")
    private int numerisSarase;

    @Column (name = "vartotojo_kodas")
    private int vartotojoKodas;

    @Column (name = "renginio_kodas")
    private int renginioKodas;

    public int getRezervavimoNumeris() {
        return rezervavimoNumeris;
    }

    public void setRezervavimoNumeris(int rezervavimoNumeris) {
        this.rezervavimoNumeris = rezervavimoNumeris;
    }

    public Date getRezervavimoData() {
        return rezervavimoData;
    }

    public void setRezervavimoData(Date rezervavimoData) {
        this.rezervavimoData = rezervavimoData;
    }

    public int getNumerisSarase() {
        return numerisSarase;
    }

    public void setNumerisSarase(int numerisSarase) {
        this.numerisSarase = numerisSarase;
    }

    public int getVartotojoKodas() {
        return vartotojoKodas;
    }

    public void setVartotojoKodas(int vartotojoKodas) {
        this.vartotojoKodas = vartotojoKodas;
    }

    public int getRenginioKodas() {
        return renginioKodas;
    }

    public void setRenginioKodas(int renginioKodas) {
        this.renginioKodas = renginioKodas;
    }
}
