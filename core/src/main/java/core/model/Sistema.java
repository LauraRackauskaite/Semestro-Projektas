package core.model;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by daini on 2017-05-02.
 */
@Entity
@Table(name = "sistemos")
public class Sistema {
    @Id
    @Column (name = "nustatymo_identifikacijos_numeris")
    private int nustatymoIdentifikacijosNumeris;

    @Column (name = "sistemos_nustatymo_komentaras")
    private String sistemosNustatymoKomentaras;

    @Column (name = "pagrindine_nustatymo_reiksme")
    private String pagrindineNustatymoReiksme;

    @Column (name = "antrine_nustatymo_reiksme")
    private String antrineNustatymoReiksme;

    @Column (name = "buvusi_reiksme_iki_pakeitimo")
    private String buvusiReiksmeIkiPakeitimo;

    @Column (name = "pakeites_asmuo")
    private String pakeitesAsmuo;

    @Column (name = "data")
    private Date data;

    public int getNustatymoIdentifikacijosNumeris() {
        return nustatymoIdentifikacijosNumeris;
    }

    public void setNustatymoIdentifikacijosNumeris(int nustatymoIdentifikacijosNumeris) {
        this.nustatymoIdentifikacijosNumeris = nustatymoIdentifikacijosNumeris;
    }

    public String getSistemosNustatymoKomentaras() {
        return sistemosNustatymoKomentaras;
    }

    public void setSistemosNustatymoKomentaras(String sistemosNustatymoKomentaras) {
        this.sistemosNustatymoKomentaras = sistemosNustatymoKomentaras;
    }

    public String getPagrindineNustatymoReiksme() {
        return pagrindineNustatymoReiksme;
    }

    public void setPagrindineNustatymoReiksme(String pagrindineNustatymoReiksme) {
        this.pagrindineNustatymoReiksme = pagrindineNustatymoReiksme;
    }

    public String getAntrineNustatymoReiksme() {
        return antrineNustatymoReiksme;
    }

    public void setAntrineNustatymoReiksme(String antrineNustatymoReiksme) {
        this.antrineNustatymoReiksme = antrineNustatymoReiksme;
    }

    public String getBuvusiReiksmeIkiPakeitimo() {
        return buvusiReiksmeIkiPakeitimo;
    }

    public void setBuvusiReiksmeIkiPakeitimo(String buvusiReiksmeIkiPakeitimo) {
        this.buvusiReiksmeIkiPakeitimo = buvusiReiksmeIkiPakeitimo;
    }

    public String getPakeitesAsmuo() {
        return pakeitesAsmuo;
    }

    public void setPakeitesAsmuo(String pakeitesAsmuo) {
        this.pakeitesAsmuo = pakeitesAsmuo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
