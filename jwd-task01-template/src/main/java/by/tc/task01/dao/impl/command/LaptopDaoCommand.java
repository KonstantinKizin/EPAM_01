package by.tc.task01.dao.impl.command;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.dao.impl.txtSourceImpl.LaptopTxtDaoImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class LaptopDaoCommand implements Command {

    private Criteria<SearchCriteria.Laptop> criterian;


    public LaptopDaoCommand(Criteria criteria) {
        this.criterian = criteria;
    }

    @Override
    public Appliance execute() {
        return new LaptopTxtDaoImpl().find(criterian);

    }
}
