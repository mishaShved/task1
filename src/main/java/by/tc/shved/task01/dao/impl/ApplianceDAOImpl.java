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

		List<Appliance> appliance = new ArrayList<>();

		String[] appliances = {};

		ApplianceFactory factory = ApplianceFactory.getInstance();

		try {
			appliances = ApplianceFileReader.readFile("src/main/resources/appliances_db.txt");
		}catch(IOException e){
			new WorkingWithDataSourceException();
		}

		boolean flag;

		for(String applianceText: appliances){

			flag = true;

			if(applianceText.toLowerCase().startsWith(criteria.getApplianceType().toString())){

				for(E criteriaKey : criteria.getKeySet()){

					if(!ApplianceFileReader.getValue(criteriaKey.toString() ,applianceText)
							.equalsIgnoreCase(criteria.getElement(criteriaKey).toString())){

						flag = false;
						break;
					}

				}

				if (flag){

					appliance.add(factory.getCreator(criteria.getApplianceType()).create(applianceText));

					}

				}

			}

			return appliance;
	}
}
