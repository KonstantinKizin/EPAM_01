package by.tc.task01.dao.impl.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.HashMap;
import java.util.Map;

public class DaoDirector {

    private Map<String , Command> comands = new HashMap<String, Command>();

    private Criteria criteria;

    public DaoDirector(Criteria criteria){

        this.criteria = criteria;
        comands.put("Oven" , new OvenDaoCommand(criteria));
        comands.put("Laptop" , new LaptopDaoCommand(criteria));
        comands.put("Refrigerator" , new RefrigeratorDaoCommand(criteria));
        comands.put("Speakers" , new SpeakersDaoCommand(criteria));
        comands.put("TabletPC" , new TabletPCDaoCommand(criteria));
        comands.put("VacuumCleaner" , new VacuumCleaneDaoCommand(criteria));

    }


    public Appliance find(String appType){

        Command command = comands.get(appType);
        return command.execute();
    }



}
