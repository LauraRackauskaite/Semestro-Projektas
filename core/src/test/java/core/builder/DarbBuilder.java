package core.builder;

import core.model.Darbuotojas;

/**
 * Created by SimphonX on 2016-05-22.
 */
public class DarbBuilder {
    private Darbuotojas darb = new Darbuotojas();

    public DarbBuilder() {
        darb.setId(1);
        darb.setPavarde("Petras");
        darb.setPavarde("Petraitis");
    }

    public static DarbBuilder init() {
        return new DarbBuilder();
    }

    public Darbuotojas build() {
        return darb;
    }

    public DarbBuilder withId(Integer id) {
        darb.setId(id);
        return this;
    }

    public DarbBuilder withName(String Vardas, String pavarde) {
        this.darb.setVardas(Vardas);
        this.darb.setPavarde(pavarde);
        return this;
    }
}
