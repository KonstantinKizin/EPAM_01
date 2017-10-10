package by.tc.task01.dao.impl.command;

import by.tc.task01.dao.impl.txtSourceImpl.RefrigeratorTxtDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class RefrigeratorDaoCommand implements Command {

   private Criteria criteria;

    public RefrigeratorDaoCommand(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public Appliance execute() {
        return new RefrigeratorTxtDAOImpl().find(criteria);
    }
}
