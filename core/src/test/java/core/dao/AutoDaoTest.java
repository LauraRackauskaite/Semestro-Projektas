package core.dao;

import core.builder.AutoBuilder;
import core.config.TestConfiguration;
import core.dao.repository.AutomobilisRepository;
import core.model.Automobilis;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by SimphonX on 2016-05-22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@Transactional
public class AutoDaoTest {

    private Automobilis john;
    private Automobilis jane;

    @Autowired
    private AutomobilisDao autDao;

    @Autowired
    private AutomobilisRepository autoRepository;

    @Before
    public void setUp() {
        john = AutoBuilder.init().withId(8).build();
        jane = AutoBuilder.init().withId(6).withName("Mazda", "String").build();

        System.out.println(john.getMarke());
        autoRepository.save(john);
        autoRepository.save(jane);
    }

    @Test
    public void testFindAllEntries() {
        List<Automobilis> persons = autDao.findAll();

        assertEquals(2, persons.size());
    }

    @Test
    public void testFindByIdAndName() {
        Automobilis result = autDao.findByModelisAndMarke(jane.getModelis(), jane.getMarke());
        assertNotNull(result);
    }
}
