package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.txtSourceImpl.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;



public class ApplianceDAOImpl implements ApplianceDAO{

	private OvenTxtDAOImpl ovenTxtDAO = new OvenTxtDAOImpl();

	private LaptopTxtDaoImpl laptopTxtDao = new LaptopTxtDaoImpl();

	private RefrigeratorTxtDAOImpl refrigeratorTxtDAO = new RefrigeratorTxtDAOImpl();

	private TablePCTxtDAOImpl tablePCTxtDAO = new TablePCTxtDAOImpl();

	private SpeakersTxtDAOImpl speakersTxtDAO = new SpeakersTxtDAOImpl();

	private VacuumTxtDAOImpl vacuumTxtDAO = new VacuumTxtDAOImpl();

	@Override
	public  <E> Appliance find(Criteria<E> criteria)  {
		Appliance appliance = null;
		String applianceName = criteria.getApplianceType();

		if(applianceName.equalsIgnoreCase("Oven")){
			appliance =  ovenTxtDAO.find(criteria);
		}else if(applianceName.equalsIgnoreCase("Laptop")){
			appliance = laptopTxtDao.find(criteria);
		}else if(applianceName.equalsIgnoreCase("Refrigerator")){
			appliance = refrigeratorTxtDAO.find(criteria);
		}else if(applianceName.equalsIgnoreCase("TabletPC")){
			appliance = tablePCTxtDAO.find(criteria);
		}else if(applianceName.equalsIgnoreCase("Speakers")){
			appliance = speakersTxtDAO.find(criteria);
		}else if(applianceName.equalsIgnoreCase("VacuumCleaner")){
			appliance  = vacuumTxtDAO.find(criteria);
		}

		return appliance;
	}

}




