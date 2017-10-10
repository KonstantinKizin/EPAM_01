package by.tc.task01.service.validation.command;
import java.util.Collection;


public abstract class NumberValidator {

    static boolean cheakforNumber(Collection<Object> values){

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



}
