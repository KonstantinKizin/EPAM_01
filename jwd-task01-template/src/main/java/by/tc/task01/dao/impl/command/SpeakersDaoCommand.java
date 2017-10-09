package by.tc.task01.dao.impl.command;

import by.tc.task01.entity.Appliance;

import java.util.Map;

public class SpeakersDaoCommand implements Command {

    private Map<Object , Object> criterians;

    public SpeakersDaoCommand(Map<Object, Object> criterians) {
        this.criterians = criterians;
    }

    @Override
    public Appliance execute() {
        return null;
    }
}
