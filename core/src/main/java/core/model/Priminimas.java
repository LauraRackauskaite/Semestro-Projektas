package core.model;
import javax.persistence.*;
/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "priminimai")
public class Priminimas {
    @Id
    @Column (name = "priminimo_numeris")
    private int priminimoNumeris;

    @Column (name = "priminimo_tekstas")
    private String priminimoTekstas;

    @Column (name = "rezervavimo_kodas")
    private int rezervavimoKodas;

    public int getPriminimoNumeris() {
        return priminimoNumeris;
    }

    public void setPriminimoNumeris(int priminimoNumeris) {
        this.priminimoNumeris = priminimoNumeris;
    }

    public String getPriminimoTekstas() {
        return priminimoTekstas;
    }

    public void setPriminimoTekstas(String priminimoTekstas) {
        this.priminimoTekstas = priminimoTekstas;
    }

    public int getRezervavimoKodas() {
        return rezervavimoKodas;
    }

    public void setRezervavimoKodas(int rezervavimoKodas) {
        this.rezervavimoKodas = rezervavimoKodas;
    }
}
