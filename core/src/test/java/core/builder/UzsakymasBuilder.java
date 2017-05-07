package core.builder;

import core.model.Uzsakymas;

import java.sql.Date;

/**
 * Created by SimphonX on 2016-05-22.
 */
public class UzsakymasBuilder {
    private Uzsakymas obj = new Uzsakymas();

    public UzsakymasBuilder() {
        obj.setId(1);
        obj.setPristatymoVieta("Kaunas");
        obj.setUsakymoData(new Date(2016,02,03));
    }

    public static UzsakymasBuilder init() {
        return new UzsakymasBuilder();
    }

    public Uzsakymas build() {
        return obj;
    }

    public UzsakymasBuilder withId(Integer id) {
        obj.setId(id);
        return this;
    }

    public UzsakymasBuilder withName(String Vieta, Date data) {
        obj.setPristatymoVieta(Vieta);
        obj.setUsakymoData(data);
        return this;
    }
}
