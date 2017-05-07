package core.builder;

import core.model.Automobilis;

/**
 * Created by SimphonX on 2016-05-22.
 */
public class AutoBuilder {
    private Automobilis car = new Automobilis();

    public AutoBuilder() {
        car.setId(1);
        car.setMarke("Mazda");
        car.setModelis("Premacy");
        car.setGr(null);
    }

    public static AutoBuilder init() {
        return new AutoBuilder();
    }

    public Automobilis build() {
        return car;
    }

    public AutoBuilder withId(Integer id) {
        car.setId(id);
        return this;
    }

    public AutoBuilder withName(String marke, String modelis) {
        this.car.setMarke(marke);
        this.car.setModelis(modelis);
        return this;
    }
}
