package by.tc.task01.service.validator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;
import static by.tc.task01.service.validation.Validator.criteriaValidator;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class VacuumCleanerCriteriaTest {
    Criteria<SearchCriteria.VacuumCleaner> criteriaVacuum;

    @Before
    public void setUp(){
        criteriaVacuum = new Criteria<SearchCriteria.VacuumCleaner>();
    }




    @Test
    public void when_FILTER_TYPE_is_not_string_then_should_return_false(){

        criteriaVacuum.add(VacuumCleaner.FILTER_TYPE , 10f);
        assertFalse(criteriaValidator(criteriaVacuum));
    }

    @Test
    public void when_BAG_TYPE_is_not_string_then_should_return_false(){

        criteriaVacuum.add(VacuumCleaner.BAG_TYPE , 10f);
        assertFalse(criteriaValidator(criteriaVacuum) );
    }

    @Test
    public void when_WAND_TYPE_is_not_string_then_should_return_false(){

        criteriaVacuum.add(VacuumCleaner.WAND_TYPE , 10f);
        assertFalse(criteriaValidator(criteriaVacuum));
    }

    @Test
    public void when_FILTER_TYPE_is_string_then_should_return_true(){

        criteriaVacuum.add(VacuumCleaner.FILTER_TYPE , "10f");
        assertTrue(criteriaValidator(criteriaVacuum));
    }

    @Test
    public void when_BAG_TYPE_is_string_then_should_return_true(){

        criteriaVacuum.add(VacuumCleaner.BAG_TYPE , "10f");
        assertTrue(criteriaValidator(criteriaVacuum));
    }

    @Test
    public void when_WAND_TYPE_is_string_then_should_return_true(){

        criteriaVacuum.add(VacuumCleaner.WAND_TYPE , "10f");
        assertTrue(criteriaValidator(criteriaVacuum) );
    }


    @Test
    public void when_WAND_TYPE_BAG_TYPE_FILTER_TYPE_are_string_and_another_one_is_not_number_then_should_return_false(){

        criteriaVacuum.add(VacuumCleaner.FILTER_TYPE , "A");
        criteriaVacuum.add(VacuumCleaner.WAND_TYPE , "A");
        criteriaVacuum.add(VacuumCleaner.BAG_TYPE , "A");
        criteriaVacuum.add(VacuumCleaner.MOTOR_SPEED_REGULATION , 10f);
        criteriaVacuum.add(VacuumCleaner.CLEANING_WIDTH , new Object());
        assertFalse(criteriaValidator(criteriaVacuum) );

    }

    @Test
    public void when_at_least_one_parameter_beside_WAND_TYPE_BAG_TYPE_FILTER_TYPE_is_not_number_should_return_false(){

        criteriaVacuum.add(VacuumCleaner.MOTOR_SPEED_REGULATION , 10f);
        criteriaVacuum.add(VacuumCleaner.CLEANING_WIDTH , new Object());
        assertFalse(criteriaValidator(criteriaVacuum) );

    }

    @Test
    public void when_all_parameters_are_valid_should_return_true(){

        criteriaVacuum.add(VacuumCleaner.FILTER_TYPE , "A");
        criteriaVacuum.add(VacuumCleaner.WAND_TYPE , "A");
        criteriaVacuum.add(VacuumCleaner.BAG_TYPE , "A");
        criteriaVacuum.add(VacuumCleaner.MOTOR_SPEED_REGULATION , 10f);
        criteriaVacuum.add(VacuumCleaner.CLEANING_WIDTH ,10);
        criteriaVacuum.add(VacuumCleaner.POWER_CONSUMPTION ,10);
        assertTrue(criteriaValidator(criteriaVacuum));

    }

    @Test
    public void when_at_least_one_string_parameter_has_lenght_zero_then_should_return_false(){

        criteriaVacuum.add(VacuumCleaner.FILTER_TYPE , "A");
        criteriaVacuum.add(VacuumCleaner.WAND_TYPE , "");
        criteriaVacuum.add(VacuumCleaner.BAG_TYPE , "A");
        criteriaVacuum.add(VacuumCleaner.MOTOR_SPEED_REGULATION , 10f);
        criteriaVacuum.add(VacuumCleaner.CLEANING_WIDTH ,10);
        criteriaVacuum.add(VacuumCleaner.POWER_CONSUMPTION ,10);
        assertFalse(criteriaValidator(criteriaVacuum));

    }








}
