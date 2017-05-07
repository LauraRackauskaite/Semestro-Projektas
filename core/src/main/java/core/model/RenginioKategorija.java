package core.model;
import javax.persistence.*;
/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "renginio_kategorijos")
public class RenginioKategorija {
    @Id
    @Column (name = "renginio_kategorijos_numeris")
    private int renginioKategorijosNumeris;

    @Column (name = "pavadinimas")
    private String pavadinimas;

    public int getRenginioKategorijosNumeris() {
        return renginioKategorijosNumeris;
    }

    public void setRenginioKategorijosNumeris(int renginioKategorijosNumeris) {
        this.renginioKategorijosNumeris = renginioKategorijosNumeris;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
}
