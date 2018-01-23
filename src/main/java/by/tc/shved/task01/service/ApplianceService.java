package by.tc.shved.task01.service;

import by.tc.shved.task01.entity.Appliance;
import by.tc.shved.task01.entity.criteria.Criteria;
import by.tc.shved.task01.exception.WorkingWithDataSourceException;

import java.util.List;

public interface ApplianceService {	
	
	<E> List<Appliance> find(Criteria<E> criteria) throws WorkingWithDataSourceException;
	
}

