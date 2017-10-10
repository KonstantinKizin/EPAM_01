package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.command.DaoDirector;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;



public class ApplianceDAOImpl implements ApplianceDAO{



	@Override
	public  <E> Appliance find(Criteria<E> criteria)  {

		Appliance appliance = null;

		String applianceType = criteria.getApplianceType();

		DaoDirector daoDirector = new DaoDirector(criteria);

		appliance = daoDirector.find(applianceType);

		return appliance;
	}

}




