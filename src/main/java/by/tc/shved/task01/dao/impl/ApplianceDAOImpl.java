package by.tc.shved.task01.dao.impl;

import by.tc.shved.task01.factory.ApplianceFactory;
import by.tc.shved.task01.dao.ApplianceDAO;
import by.tc.shved.task01.entity.Appliance;
import by.tc.shved.task01.entity.criteria.Criteria;
import by.tc.shved.task01.exception.WorkingWithDataSourceException;
import by.tc.shved.task01.parser.ApplianceFileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO{
    

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) throws WorkingWithDataSourceException{

		List<Appliance> searchResult = new ArrayList<>();

		String[] appliances = {};

		ApplianceFactory factory = ApplianceFactory.getInstance();


		try {
			appliances = ApplianceFileReader.readFile("src/main/resources/appliances_db.txt");
		} catch (IOException e) {
			throw new WorkingWithDataSourceException();
		}


		boolean fitsCriteria;

		for(String applianceText: appliances){

			fitsCriteria = true;

			if(applianceText.toLowerCase().startsWith(criteria.getApplianceType().toString())){

				for(E criteriaKey : criteria.getKeySet()){

					if(!ApplianceFileReader.getValue(criteriaKey.toString() ,applianceText)
							.equalsIgnoreCase(criteria.getElement(criteriaKey).toString())){

						fitsCriteria = false;
						break;
					}

				}

				if (fitsCriteria){

					searchResult.add(factory.getCreator(criteria.getApplianceType()).create(applianceText));

					}

				}

			}

			return searchResult;
	}

}
