package by.tc.shved.task01.service.impl;

import by.tc.shved.task01.dao.ApplianceDAO;
import by.tc.shved.task01.dao.DAOFactory;
import by.tc.shved.task01.entity.Appliance;
import by.tc.shved.task01.entity.criteria.Criteria;
import by.tc.shved.task01.exception.WorkingWithDataSourceException;
import by.tc.shved.task01.service.ApplianceService;
import by.tc.shved.task01.service.validation.Validator;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) throws WorkingWithDataSourceException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance = applianceDAO.find(criteria);
		
		return appliance;
	}

}

//you may add your own new classes
