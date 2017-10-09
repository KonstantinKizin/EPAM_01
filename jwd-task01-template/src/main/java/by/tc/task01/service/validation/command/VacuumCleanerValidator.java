package by.tc.task01.service.validation.command;


import java.util.Map;

public class VacuumCleanerValidator implements Command {

    private Map<Object , Object> criterians;

    public VacuumCleanerValidator(Map<Object, Object> criterians) {
        this.criterians = criterians;
    }

    @Override
    public boolean execute() {


        return false;
    }
}
