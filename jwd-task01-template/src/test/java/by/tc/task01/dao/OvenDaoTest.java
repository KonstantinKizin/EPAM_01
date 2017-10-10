package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class OvenDaoTest {

    private static ApplianceDAO applianceDAO;

    private static Oven oven;

    private Appliance appliance;

    @BeforeClass
    public static void setUpClass(){

        applianceDAO = new ApplianceDAOImpl();
        oven = new Oven();
        oven.setPowerConsumption(1500f);
        oven.setWeight(12);
        oven.setCapacity(33);
        oven.setDepth(60);
        oven.setHeight(45);
        oven.setWidth(68);

    }


    @Test
    public void when_dont_find_then_should_return_null(){

        Criteria<SearchCriteria.Oven> criteria = new Criteria<SearchCriteria.Oven>();
        criteria.add(SearchCriteria.Oven.CAPACITY , 200);
        appliance = applianceDAO.find(criteria);
        Assert.assertTrue(appliance == null);

    }

    @Test
    public void when_criterians_are_valid_then_should_return_correct_oven(){

        Criteria<SearchCriteria.Oven> criteria = new Criteria<SearchCriteria.Oven>();
        criteria.add(SearchCriteria.Oven.CAPACITY , 33);
        criteria.add(SearchCriteria.Oven.HEIGHT , 45);
        appliance = applianceDAO.find(criteria);
        Assert.assertTrue(appliance.equals(oven));

        Criteria<SearchCriteria.Oven> criteria1 = new Criteria<SearchCriteria.Oven>();
        criteria.add(SearchCriteria.Oven.POWER_CONSUMPTION , 1500);
        criteria.add(SearchCriteria.Oven.DEPTH ,60 );
        Assert.assertTrue(appliance.equals(oven));





    }


}
