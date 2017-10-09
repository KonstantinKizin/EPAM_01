package by.tc.task01.service.validation.command;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.Map;

public class LaptopValidator extends ApplianceValidator implements Command {

    private Map<Object , Object> criterians;

    public LaptopValidator(Map<Object, Object> criterians) {
        this.criterians = criterians;
    }

    @Override
    public boolean execute() {
        ArrayList<Object> values = new ArrayList<Object>(criterians.values());

        if(criterians.containsKey(SearchCriteria.Laptop.OS) == false){
            return super.cheakforNumber(criterians.values());
        }else{
            Object os = criterians.get(SearchCriteria.Laptop.OS);
            if( os instanceof String){
                values.remove(os);
                return cheakforNumber(values);
            }else {
                return false;
            }
        }

    }
}
