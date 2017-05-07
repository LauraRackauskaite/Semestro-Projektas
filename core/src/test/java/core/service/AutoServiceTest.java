package core.service;

import core.dao.AutomobilisDao;
import core.model.Automobilis;
import core.service.impl.AutomobilisServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.ReflectionTestUtils.setField;

/**
 * Created by SimphonX on 2016-05-22.
 */
public class AutoServiceTest {
    private AutomobilisService autoService;

    @Before
    public void setUp() {
        autoService = new AutomobilisServiceImpl();

        AutomobilisDao autoDao = mock(AutomobilisDao.class);
        when(autoDao.findAll()).thenReturn(getMockNamesList());

        setField(autoService, "autoDao", autoDao);
    }

    @Test
    public void testFindAllNames() {
        List<Automobilis> results = autoService.findAllAuto();

        assertEquals(2, results.size());

        Automobilis john = results.get(0);
        assertTrue(john.getId().equals(1));
        assertEquals("Mazda", john.getMarke());
        assertEquals("String", john.getModelis());

        Automobilis betty = results.get(1);
        assertTrue(betty.getId().equals(2));
        assertEquals("Reno", betty.getMarke());
        assertEquals("Laguna", betty.getModelis());
    }

    private List<Automobilis> getMockNamesList() {
        Automobilis john = new Automobilis();
        john.setId(1);
        john.setMarke("Mazda");
        john.setModelis("String");

        Automobilis betty = new Automobilis();
        betty.setId(2);
        betty.setMarke("Reno");
        betty.setModelis("Laguna");

        List<Automobilis> persons = new ArrayList<>();
        persons.add(john);
        persons.add(betty);

        return persons;
    }
}
