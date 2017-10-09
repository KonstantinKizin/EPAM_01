package by.tc.task01.dao;

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


}
