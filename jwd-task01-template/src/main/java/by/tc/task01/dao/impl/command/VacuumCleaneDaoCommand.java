package by.tc.task01.dao.impl.command;

import by.tc.task01.dao.impl.txtSourceImpl.VacuumTxtDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class VacuumCleaneDaoCommand implements Command {

   private Criteria criteria;

    public VacuumCleaneDaoCommand(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public Appliance execute() {
        return new VacuumTxtDAOImpl().find(criteria);
    }
}
