package core.model;
import javax.persistence.*;
/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "renginio_busenos")
public class RenginioBusena {
    @Id
    @Column (name = "renginio_busenos_numeris")
    private int renginioBusenosNumeris;

    @Column (name = "pavadinimas")
    private String pavadinimas;

    public int getRenginioBusenosNumeris() {
        return renginioBusenosNumeris;
    }

    public void setRenginioBusenosNumeris(int renginioBusenosNumeris) {
        this.renginioBusenosNumeris = renginioBusenosNumeris;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
}
