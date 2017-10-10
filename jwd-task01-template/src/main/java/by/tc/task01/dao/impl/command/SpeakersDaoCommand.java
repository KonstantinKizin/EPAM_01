package by.tc.task01.dao.impl.command;

import by.tc.task01.dao.impl.txtSourceImpl.SpeakersTxtDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class SpeakersDaoCommand implements Command {

    private Criteria criteria ;

    public SpeakersDaoCommand(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public Appliance execute() {
        return new SpeakersTxtDAOImpl().find(criteria);
    }
}
