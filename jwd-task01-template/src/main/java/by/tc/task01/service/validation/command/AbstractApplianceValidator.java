package by.tc.task01.service.validation.command;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Collection;
import java.util.Map;

public abstract class AbstractApplianceValidator {

    protected boolean cheakforNumber(Collection<Object> values){

        for(Object tmp : values){
            if((tmp instanceof Number)){
                if(((Number) tmp).doubleValue() < 0) {
                    return false;
                }
            }
            if((tmp instanceof Number) == false) {
                return false;
            }
        }
        return true;
    }

    protected boolean checkCriteriaForString(Map<Object , Object> map , SearchCriteria searchCriteria){

        if(map.containsKey(searchCriteria)){
            Object criteria = map.get(searchCriteria);
            if(criteria instanceof String){
                return true;
            }else return false;
        }
        return false;
    }


}
