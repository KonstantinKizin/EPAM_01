package by.tc.task01.dao.impl.command;

import by.tc.task01.dao.impl.txtSourceImpl.OvenTxtDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;


public class OvenDaoCommand implements Command {

    private Criteria criteria;

    public OvenDaoCommand(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public Appliance execute() {
        return new OvenTxtDAOImpl().find(criteria);
    }
}
