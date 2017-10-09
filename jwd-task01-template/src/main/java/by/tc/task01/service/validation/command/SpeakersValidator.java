package by.tc.task01.service.validation.command;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpeakersValidator  extends ApplianceValidator implements Command {

    private Map<Object , Object> criterians;


    public SpeakersValidator(Map<Object, Object> criterians) {
        this.criterians = criterians;
    }

    @Override
    public boolean execute() {
        ArrayList<Object> values = new ArrayList<Object>(criterians.values());
        if(criterians.containsKey(SearchCriteria.Speakers.FREQUENCY_RANGE)){
            Object color = criterians.get(SearchCriteria.Speakers.FREQUENCY_RANGE);
            if(color instanceof String){
                String freRange = (String) color;
                Pattern pattern = Pattern.compile("(\\d{1,})-(\\d{1,})");
                Matcher matcher = pattern.matcher(freRange);
                if(matcher.find()){
                    values.remove(color);
                }else return false;
            }else return false;
        }
        return super.cheakforNumber(values);
    }
}
