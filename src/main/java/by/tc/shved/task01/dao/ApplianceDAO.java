package by.tc.shved.task01.dao;

import by.tc.shved.task01.entity.Appliance;
import by.tc.shved.task01.entity.criteria.Criteria;
import by.tc.shved.task01.exception.WorkingWithDataSourceException;

import java.util.List;

public interface ApplianceDAO {
	<E> List<Appliance> find(Criteria<E> criteria) throws WorkingWithDataSourceException;
}
