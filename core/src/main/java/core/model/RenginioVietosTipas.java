package core.model;
import javax.persistence.*;

@Entity
@Table(name = "renginio_vietos_tipai")
public class RenginioVietosTipas {
    @Id
    @Column (name = "vietos_tipo_numeris")
    private int vietosTipoNumeris;

    @Column (name = "pavadinimas")
    private String pavadinimas;

    public int getVietosTipoNumeris() {
        return vietosTipoNumeris;
    }

    public void setVietosTipoNumeris(int vietosTipoNumeris) {
        this.vietosTipoNumeris = vietosTipoNumeris;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
}
