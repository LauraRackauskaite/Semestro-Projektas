package core.model;
import javax.persistence.*;
/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "telefonai")
public class Telefonas {
    @Id
    @Column (name = "numeris")
    private String numeris;

    @Column (name = "vartotojo_kodas")
    private int vartotojoKodas;

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public int getVartotojoKodas() {
        return vartotojoKodas;
    }

    public void setVartotojoKodas(int vartotojoKodas) {
        this.vartotojoKodas = vartotojoKodas;
    }
}
