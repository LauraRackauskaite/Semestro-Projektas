package core.model;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "vartotojai")
public class Vartotojas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "vartotojo_kodas")
    private int vartotojoKodas;

    @Column (name = "vardas")
    private String vardas;

    @Column (name = "pavarde")
    private String pavarde;

    @Column (name = "lytis")
    private int lytis;

    @Column (name = "e_pastas")
    private String ePastas;

    @Column (name = "adresas")
    private String adresas;

    @Column (name = "sukurimo_data")
    private Date sukurimoData;

    @Column (name = "ar_aktyvus")
    private int arAktyvus;

    @Column (name = "slaptazodis")
    private String slaptazodis;

    @Column (name = "vartotojo_tipo_kodas")
    private int vartotojoTipoKodas;

    public int getVartotojoKodas() {
        return vartotojoKodas;
    }

    public void setVartotojoKodas(int vartotojoKodas) {
        this.vartotojoKodas = vartotojoKodas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getLytis() {
        return lytis;
    }

    public void setLytis(int lytis) {
        this.lytis = lytis;
    }

    public String getePastas() {
        return ePastas;
    }

    public void setePastas(String ePastas) {
        this.ePastas = ePastas;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public Date getSukurimoData() {
        return sukurimoData;
    }

    public void setSukurimoData(Date sukurimoData) {
        this.sukurimoData = sukurimoData;
    }

    public int getArAktyvus() {
        return arAktyvus;
    }

    public void setArAktyvus(int arAktyvus) {
        this.arAktyvus = arAktyvus;
    }

    public String getSlaptazodis() {
        return slaptazodis;
    }

    public void setSlaptazodis(String slaptazodis) {
        this.slaptazodis = slaptazodis;
    }

    public int getVartotojoTipoKodas() {
        return vartotojoTipoKodas;
    }

    public void setVartotojoTipoKodas(int vartotojoTipoKodas) {
        this.vartotojoTipoKodas = vartotojoTipoKodas;
    }
}
