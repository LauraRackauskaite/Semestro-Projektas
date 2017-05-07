package core.builder;

import core.model.Filialas;

/**
 * Created by SimphonX on 2016-05-22.
 */
public class FilialasBuilder {
    private Filialas obj = new Filialas();

    public FilialasBuilder() {
        obj.setId(1);
        obj.setAdresas("Gricupio 20");
        obj.setMiestas("Kaunas");
    }

    public static FilialasBuilder init() {
        return new FilialasBuilder();
    }

    public Filialas build() {
        return obj;
    }

    public FilialasBuilder withId(Integer id) {
        obj.setId(id);
        return this;
    }

    public FilialasBuilder withName(String Miestas, String Adresas) {
        this.obj.setAdresas(Adresas);
        this.obj.setMiestas(Miestas);
        return this;
    }
}
