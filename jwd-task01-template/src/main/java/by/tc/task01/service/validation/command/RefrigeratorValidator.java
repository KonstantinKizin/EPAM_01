package by.tc.task01.service.validation.command;

import java.util.Map;

public class RefrigeratorValidator implements Command {

    private Map<Object , Object> criterians;

    public RefrigeratorValidator(Map<Object, Object> criterians) {
        this.criterians = criterians;
    }

    @Override
    public boolean execute() {
        return false;
    }
}
