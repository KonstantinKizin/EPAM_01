package by.tc.task01.dao;

import by.tc.task01.dao.impl.txtSourceImpl.RefrigeratorTxtDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class RefrigeratorDaoTest {

    private static ApplianceDAO applianceDAO;

    private Appliance appliance;

    private static Refrigerator refrigeratorOne;

    private static Refrigerator refrigeratorTwo;



    @BeforeClass
    public static void setUpClass(){

        applianceDAO = new RefrigeratorTxtDAOImpl();


        refrigeratorOne = new Refrigerator();
        refrigeratorOne.setPowerConsumption(100);
        refrigeratorOne.setWeight(20);
        refrigeratorOne.setFreezerCapacity(10);
        refrigeratorOne.setOverallCapacity(300);
        refrigeratorOne.setHeight(200);
        refrigeratorOne.setWidth(70);

        refrigeratorTwo = new Refrigerator();
        refrigeratorTwo.setPowerConsumption(200);
        refrigeratorTwo.setWeight(30);
        refrigeratorTwo.setFreezerCapacity(15);
        refrigeratorTwo.setOverallCapacity(300);
        refrigeratorTwo.setHeight(180);
        refrigeratorTwo.setWidth(80);

    }



    @Test
    public void when_dont_find_then_should_return_null(){

        Criteria<SearchCriteria.Refrigerator> criteria = new Criteria<SearchCriteria.Refrigerator>();
        criteria.add(SearchCriteria.Refrigerator.FREEZER_CAPACITY , 10);
        criteria.add(SearchCriteria.Refrigerator.WEIGHT,20);
        criteria.add(SearchCriteria.Refrigerator.WIDTH , 102);
        appliance = applianceDAO.find(criteria);
        Assert.assertTrue(appliance == null);

    }

    @Test
    public void when_criterians_are_valid_then_should_return_correct_refrigerator(){

        Criteria<SearchCriteria.Refrigerator> criteria = new Criteria<SearchCriteria.Refrigerator>();
        criteria.add(SearchCriteria.Refrigerator.FREEZER_CAPACITY , 10);
        criteria.add(SearchCriteria.Refrigerator.WEIGHT,20);
        appliance = applianceDAO.find(criteria);

        Assert.assertThat(appliance , Is.<Appliance>is(refrigeratorOne));

        Criteria<SearchCriteria.Refrigerator> criteria1 = new Criteria<SearchCriteria.Refrigerator>();

        criteria1.add(SearchCriteria.Refrigerator.OVERALL_CAPACITY , 300);
        criteria.add(SearchCriteria.Refrigerator.FREEZER_CAPACITY , 15);
        criteria.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION , 200);
        appliance = applianceDAO.find(criteria1);

        Assert.assertThat(appliance , Is.<Appliance>is(refrigeratorTwo));

    }

}
