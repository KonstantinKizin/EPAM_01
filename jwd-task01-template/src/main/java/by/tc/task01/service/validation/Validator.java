package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.command.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	private Map<String , Command> commandMap = new HashMap<String, Command>();
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		Map<Object , Object> criterians = (Map<Object, Object>)criteria.getCriteria();

		if(criterians.values().size() == 0) {
			return false;
		}

		String applianceType = criteria.getApplianceType();

		ApplianceCommandDirector commandDirector = new ApplianceCommandDirector(criterians);

		return commandDirector.validate(applianceType);
	}
}

