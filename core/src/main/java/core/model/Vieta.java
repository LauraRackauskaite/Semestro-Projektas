package core.model;
import javax.persistence.*;
/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "vietos")
public class Vieta {
    @Id
    @Column (name = "vietos_numeris")
    private int vietosNumeris;

    @Column (name = "gatves_pavadinimas")
    private String gatvesPavadinimas;

    @Column (name = "namo_numeris")
    private int namoNumeris;

    @Column (name = "miestas")
    private String miestas;

    public int getVietosNumeris() {
        return vietosNumeris;
    }

    public void setVietosNumeris(int vietosNumeris) {
        this.vietosNumeris = vietosNumeris;
    }

    public String getGatvesPavadinimas() {
        return gatvesPavadinimas;
    }

    public void setGatvesPavadinimas(String gatvesPavadinimas) {
        this.gatvesPavadinimas = gatvesPavadinimas;
    }

    public int getNamoNumeris() {
        return namoNumeris;
    }

    public void setNamoNumeris(int namoNumeris) {
        this.namoNumeris = namoNumeris;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }
}
