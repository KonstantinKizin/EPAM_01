package by.tc.task01.service.validation.command;

import java.util.Map;

public class OvenValidator  extends AbstractApplianceValidator implements Command {

    private Map<Object , Object> criterians;

    public OvenValidator(Map<Object, Object> criterians) {
        this.criterians = criterians;
    }

    @Override
    public boolean execute() {
        return super.cheakforNumber(criterians.values());
    }
}