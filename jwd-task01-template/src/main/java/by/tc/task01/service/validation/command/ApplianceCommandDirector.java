package by.tc.task01.service.validation.command;

import java.util.HashMap;
import java.util.Map;

public class ApplianceCommandDirector {

    private Map<String , Command> commandMap = new HashMap<String, Command>();

    public ApplianceCommandDirector(Map<Object,Object> commandMap) {

        commandMap.put("Oven" , new OvenValidator(commandMap));
        commandMap.put("Laptop" , new LaptopValidator(commandMap));
        commandMap.put("Refrigerator" , new RefrigeratorValidator(commandMap));
        commandMap.put("Speakers" , new SpeakersValidator(commandMap));
        commandMap.put("TabletPC" , new TablePCValidator(commandMap));
        commandMap.put("VacuumCleaner" , new VacuumCleanerValidator(commandMap));

    }

    public boolean validate(String appType){
        return commandMap.get(appType).execute();
    }

}
