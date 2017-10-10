package by.tc.task01.service.validation.command;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.Map;

public class TablePCValidator  implements Command {

    private Map<Object , Object> criterians;

    public TablePCValidator(Map<Object, Object> criterians) {
        this.criterians = criterians;
    }

    @Override
    public boolean execute() {
        ArrayList<Object> values = new ArrayList<Object>(criterians.values());
        if(criterians.containsKey(SearchCriteria.TabletPC.COLOR)){
            Object color = criterians.get(SearchCriteria.TabletPC.COLOR);
            if((color instanceof String) == false) return false;
            Object value = criterians.get(SearchCriteria.TabletPC.COLOR);
            SearchCriteria.TabletPC key = SearchCriteria.TabletPC.COLOR;
            values.remove(value);
            return NumberValidator.cheakforNumber(values);
        }else {
            return NumberValidator.cheakforNumber(values);
        }
    }
}
