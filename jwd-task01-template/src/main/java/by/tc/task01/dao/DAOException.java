package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

public class DAOException extends RuntimeException {

    public DAOException(){
        super();
    }

    public DAOException(Exception e){
        super(e);
    }

    public DAOException(String cause){
        super(cause);
    }

    public DAOException(String cause , Exception e){
        super(cause , e);
    }


    public static final class DAOFactory {

        private static final DAOFactory instance = new DAOFactory();

        private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

        private DAOFactory() {}

        public ApplianceDAO getApplianceService() {
            return applianceDAO;
        }

        public static DAOFactory getInstance() {
            return instance;
        }
    }
}
