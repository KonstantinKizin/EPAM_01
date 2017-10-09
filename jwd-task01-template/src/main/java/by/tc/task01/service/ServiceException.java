package by.tc.task01.service;

public class ServiceException extends RuntimeException {

    public ServiceException(String e ){
        super(e);
    }

    public ServiceException(Exception e){
        super(e);
    }

    public ServiceException(){
        super();
    }

    public  ServiceException(String cause , Exception e){
        super(cause ,e);
    }

}
