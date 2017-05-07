package core.model;
import javax.persistence.*;
/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "vartotojo_tipai")
public class VartotojoTipas {
    @Id
    @Column (name = "vartotojo_tipo_numeris")
    private int vartotojoTipoNumeris;

    @Column (name = "tipas")
    private String tipas;

    public int getVartotojoTipoNumeris() {
        return vartotojoTipoNumeris;
    }

    public void setVartotojoTipoNumeris(int vartotojoTipoNumeris) {
        this.vartotojoTipoNumeris = vartotojoTipoNumeris;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }
}
