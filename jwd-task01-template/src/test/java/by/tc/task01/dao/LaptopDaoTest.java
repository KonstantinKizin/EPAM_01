package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LaptopDaoTest {

    private static ApplianceDAO applianceDAO;

    private static Laptop laptop;

    private static Laptop laptop1;



    @BeforeClass
    public static void setUpClass(){

        applianceDAO = new ApplianceDAOImpl();

        laptop = new Laptop();
        laptop.setBatteryCapacity(1);
        laptop.setMemoryRom(4000);
        laptop.setOs("Windows");
        laptop.setSystemMemory(1000);
        laptop.setDisplayInchs(18);
        laptop.setCpu(1.2f);

        laptop1 = new Laptop();
        laptop1.setBatteryCapacity(1.5f);
        laptop1.setSystemMemory(1000);
        laptop1.setOs("Linux");
        laptop1.setDisplayInchs(19);
        laptop1.setCpu(2.2f);
        laptop1.setMemoryRom(8000);

    }

    @Test
    public void when_dont_find_then_should_return_null(){

        Criteria<SearchCriteria.Laptop> criteria = new Criteria<SearchCriteria.Laptop>();
        criteria.add(SearchCriteria.Laptop.BATTERY_CAPACITY , 12);
        Appliance appliance = applianceDAO.find(criteria);
        Assert.assertTrue(appliance == null);

    }



    @Test
    public void when_laptop_found_then_should_return_correct_laptop(){

        Criteria<SearchCriteria.Laptop> criteria = new Criteria<SearchCriteria.Laptop>();
        criteria.add(SearchCriteria.Laptop.BATTERY_CAPACITY , 1);
        Appliance appliance = applianceDAO.find(criteria);
        Assert.assertTrue(appliance.equals(laptop));

        Criteria<SearchCriteria.Laptop> criteria1 = new Criteria<SearchCriteria.Laptop>();
        criteria.add(SearchCriteria.Laptop.BATTERY_CAPACITY , 1.5f);
        Appliance appliance1 = applianceDAO.find(criteria);
        Assert.assertTrue(appliance1.equals(laptop1));

    }





}
