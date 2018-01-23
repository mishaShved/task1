package by.tc.shved.task01.service;

import by.tc.shved.task01.entity.Appliance;
import by.tc.shved.task01.entity.criteria.Criteria;
import java.util.List;

public interface ApplianceService {	
	
	<E> List<Appliance> find(Criteria<E> criteria);
	
}

