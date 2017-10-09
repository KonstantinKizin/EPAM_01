package by.tc.task01.service.validation.command;


import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class VacuumCleanerValidator extends AbstractApplianceValidator  implements Command {

    private Map<Object , Object> criterians;

    public VacuumCleanerValidator(Map<Object, Object> criterians) {
        this.criterians = criterians;
    }

    @Override
    public boolean execute() {
        if(criterians.containsKey(SearchCriteria.VacuumCleaner.FILTER_TYPE)){
            Object filterType = criterians.get(SearchCriteria.VacuumCleaner.FILTER_TYPE);
            if((filterType instanceof String) == false) return false;
        }

        if(criterians.containsKey(SearchCriteria.VacuumCleaner.BAG_TYPE)){
            Object bagType = criterians.get(SearchCriteria.VacuumCleaner.BAG_TYPE);
            if((bagType instanceof String) == false) return false;
        }

        if(criterians.containsKey(SearchCriteria.VacuumCleaner.WAND_TYPE)){
            Object wandType = criterians.get(SearchCriteria.VacuumCleaner.WAND_TYPE);
            if((wandType instanceof String) == false) return false;
        }

        Collection<Object> nubmerParamet = new ArrayList<Object>();

        for(Object obj : criterians.values()){
            if(obj instanceof Number){
                nubmerParamet.add(obj);
            }
        }

        return super.cheakforNumber(nubmerParamet);

    }
}
