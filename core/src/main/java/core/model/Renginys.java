package core.model;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "renginiai")
public class Renginys {

    @Id
    @Column (name = "renginio_kodas")
    private int renginioKodas;

    @Column (name = "pavadinimas")
    private String pavadinimas;

    @Column (name = "trumpas_aprasymas")
    private String trumpasAprasymas;

    @Column (name = "renginio_data")
    private Date renginioData;

    @Column (name = "renginio_laikas")
    private Date renginioLaikas;

    @Column (name = "renginio_trukme")
    private Date renginioTrukme;

    @Column  (name = "renginio_vietos_kodas")
    private int renginioVietosKodas;

    @Column (name = "renginio_kategorijos_kodas")
    private int renginioKategorijosKodas;

    @Column (name = "renginio_busenos_kodas")
    private int renginioBusenosKodas;

    @Column (name = "renginio_tipo_kodas")
    private int renginioTipoKodas;

    public int getRenginioKodas() {
        return renginioKodas;
    }

    public void setRenginioKodas(int renginioKodas) {
        this.renginioKodas = renginioKodas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getTrumpasAprasymas() {
        return trumpasAprasymas;
    }

    public void setTrumpasAprasymas(String trumpasAprasymas) {
        this.trumpasAprasymas = trumpasAprasymas;
    }

    public Date getRenginioData() {
        return renginioData;
    }

    public void setRenginioData(Date renginioData) {
        this.renginioData = renginioData;
    }

    public Date getRenginioLaikas() {
        return renginioLaikas;
    }

    public void setRenginioLaikas(Date renginioLaikas) {
        this.renginioLaikas = renginioLaikas;
    }

    public Date getRenginioTrukme() {
        return renginioTrukme;
    }

    public void setRenginioTrukme(Date renginioTrukme) {
        this.renginioTrukme = renginioTrukme;
    }

    public int getRenginioVietosKodas() {
        return renginioVietosKodas;
    }

    public void setRenginioVietosKodas(int renginioVietosKodas) {
        this.renginioVietosKodas = renginioVietosKodas;
    }

    public int getRenginioKategorijosKodas() {
        return renginioKategorijosKodas;
    }

    public void setRenginioKategorijosKodas(int renginioKategorijosKodas) {
        this.renginioKategorijosKodas = renginioKategorijosKodas;
    }

    public int getRenginioBusenosKodas() {
        return renginioBusenosKodas;
    }

    public void setRenginioBusenosKodas(int renginioBusenosKodas) {
        this.renginioBusenosKodas = renginioBusenosKodas;
    }

    public int getRenginioTipoKodas() {
        return renginioTipoKodas;
    }

    public void setRenginioTipoKodas(int renginioTipoKodas) {
        this.renginioTipoKodas = renginioTipoKodas;
    }
}
