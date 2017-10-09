package by.tc.task01.service.validation.command;


import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class VacuumCleanerValidator extends AbstractApplianceValidator  implements Command {

    private Map<Object , Object> criterians;

    private Collection<Object> nubmerParamet;

    public VacuumCleanerValidator(Map<Object, Object> criterians) {
        this.criterians = criterians;
        nubmerParamet = new ArrayList<Object>(criterians.values());
    }




    @Override
    public boolean execute() {

        boolean filterTypeFlag = this.checkForStringField(SearchCriteria.VacuumCleaner.FILTER_TYPE);
        boolean bagTypeFlag = this.checkForStringField(SearchCriteria.VacuumCleaner.BAG_TYPE);
        boolean wandType = this.checkForStringField(SearchCriteria.VacuumCleaner.WAND_TYPE);

        if(!(filterTypeFlag && bagTypeFlag && wandType)){
            return false;
        }

        return super.cheakforNumber(nubmerParamet);
    }

    
    private boolean checkForStringField(SearchCriteria.VacuumCleaner criteriaName){

        if(criterians.containsKey(criteriaName)){
            Object obj = criterians.get(criteriaName);
           if(obj instanceof String){
               if((((String) obj).length() == 0)) return false;
               nubmerParamet.remove(obj);
            }else return false;
        }
         return true;
    }
}
