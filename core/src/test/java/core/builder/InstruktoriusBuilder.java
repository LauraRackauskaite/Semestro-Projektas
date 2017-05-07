package core.builder;

import core.model.Instruktorius;

/**
 * Created by SimphonX on 2016-05-22.
 */
public class InstruktoriusBuilder {
    private Instruktorius obj = new Instruktorius();

    public InstruktoriusBuilder() {
        obj.setId(1);
        obj.setKategorijos("A, B, B1");
        obj.setPavarde("Petraitis");
        obj.setStazas(20);
        obj.setVardas("Petraitis");
    }

    public static InstruktoriusBuilder init() {
        return new InstruktoriusBuilder();
    }

    public Instruktorius build() {
        return obj;
    }

    public InstruktoriusBuilder withId(Integer id) {
        obj.setId(id);
        return this;
    }

    public InstruktoriusBuilder withName(String Kategorijos, String Vardas, String Pavarde, Integer Stazas) {
        this.obj.setKategorijos(Kategorijos);
        this.obj.setPavarde(Pavarde);
        this.obj.setStazas(Stazas);
        this.obj.setVardas(Vardas);
        return this;
    }
}
