package core.builder;

import core.model.Grupe;

/**
 * Created by SimphonX on 2016-05-22.
 */
public class GrupeBuilder {
    private Grupe obj = new Grupe();

    public GrupeBuilder() {
        obj.setId(1);
        obj.setAmzius(20);
        obj.setKomentaras("NZN");
        obj.setPavadinimas("G");
    }

    public static GrupeBuilder init() {
        return new GrupeBuilder();
    }

    public Grupe build() {
        return obj;
    }

    public GrupeBuilder withId(Integer id) {
        obj.setId(id);
        return this;
    }

    public GrupeBuilder withName(String Komentaras, String Pavadinimas, Integer Amzius) {
        this.obj.setAmzius(Amzius);
        this.obj.setKomentaras(Komentaras);
        this.obj.setPavadinimas(Pavadinimas);
        return this;
    }
}
