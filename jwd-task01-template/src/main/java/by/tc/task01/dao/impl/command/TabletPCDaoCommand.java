package by.tc.task01.dao.impl.command;

import by.tc.task01.dao.impl.txtSourceImpl.TablePCTxtDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;


public class TabletPCDaoCommand implements Command {

   private Criteria criteria;

    public TabletPCDaoCommand(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public Appliance execute() {
        return new TablePCTxtDAOImpl().find(criteria);
    }
}
