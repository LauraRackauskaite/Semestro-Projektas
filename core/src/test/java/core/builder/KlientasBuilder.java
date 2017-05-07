package core.builder;

import com.sun.org.apache.xpath.internal.operations.Bool;
import core.model.Klientas;

import java.math.BigInteger;
import java.sql.Date;

/**
 * Created by SimphonX on 2016-05-22.
 */
public class KlientasBuilder {
    private Klientas obj = new Klientas();

    public KlientasBuilder() {
        Long sk = new Long("39502273261");
        Date date = new Date(2016,02,03);
        obj.setId(1);
        obj.setAmzius(18);
        obj.setAsmensKodas(sk);
        obj.setPavarde("Pavarde");
        obj.setVardas("Vardas");
        obj.setPraktinioData(new Date(2016,02,03));
        obj.setTeorinioData(new Date(2016,01,25));
        obj.setTeorinioIslaikymoData(new Date(2016,01,25));
        obj.setVairavimoEgzaminas(0);
    }

    public static KlientasBuilder init() {
        return new KlientasBuilder();
    }

    public Klientas build() {
        return obj;
    }

    public KlientasBuilder withId(Integer id) {
        obj.setId(id);
        return this;
    }

    public KlientasBuilder withName(int Amzius, Long kodas, String Pavarde, String Vardas, Date datat, Date datap, Date tisl, Boolean t, Boolean p) {
        this.obj.setAmzius(Amzius);
        this.obj.setAsmensKodas(kodas);
        this.obj.setVardas(Vardas);
        this.obj.setPraktinioData(datap);
        this.obj.setTeorinioData(datat);
        this.obj.setTeorinioIslaikymoData(tisl);
        //this.obj.setVairavimoEgzaminas(p);
        return this;
    }
}
