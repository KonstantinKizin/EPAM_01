package by.tc.task01.service.validation.command;

import java.util.HashMap;
import java.util.Map;

public class ApplianceCommandDirector {

    private Map<String , Command> commandMap = new HashMap<String, Command>();

    public ApplianceCommandDirector(Map<Object,Object> criteriaMap) {

        commandMap.put("Oven" , new OvenValidator(criteriaMap));
        commandMap.put("Laptop" , new LaptopValidator(criteriaMap));
        commandMap.put("Refrigerator" , new RefrigeratorValidator(criteriaMap));
        commandMap.put("Speakers" , new SpeakersValidator(criteriaMap));
        commandMap.put("TabletPC" , new TablePCValidator(criteriaMap));
        commandMap.put("VacuumCleaner" , new VacuumCleanerValidator(criteriaMap));

    }

    public boolean validate(String appType){
        return commandMap.get(appType).execute();
    }

}
