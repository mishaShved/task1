package by.tc.shved.task01.dao.impl;

import by.tc.shved.task01.dao.ApplianceDAO;
import by.tc.shved.task01.entity.Appliance;
import by.tc.shved.task01.entity.Laptop;
import by.tc.shved.task01.entity.Oven;
import by.tc.shved.task01.entity.Refrigerator;
import by.tc.shved.task01.entity.Speakers;
import by.tc.shved.task01.entity.TabletPC;
import by.tc.shved.task01.entity.VacuumCleaner;
import by.tc.shved.task01.entity.criteria.Criteria;
import by.tc.shved.task01.entity.criteria.SearchCriteria;
import by.tc.shved.task01.parser.ApplianceFileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{
    

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria){

		List<Appliance> appliance = new ArrayList<>();

		String text = "";

		try {
			text = ApplianceFileReader.readFile("src/main/resources/appliances_db.txt");
		}catch(IOException e){
			return null;
		}

		String[] appliances = text.split("\n");

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

					switch (criteria.getApplianceType()){

						case OVEN:
							appliance.add(createOven(applianceText));
							break;
						case LAPTOP:
							appliance.add(createLaptop(applianceText));
							break;
						case SPEAKERS:
							appliance.add(createSpeakers(applianceText));
							break;
						case TABLET_PC:
							appliance.add(createTabletPC(applianceText));
							break;
						case REFRIGERATOR:
							appliance.add(createRefrigerator(applianceText));
							break;
						case VACUUM_CLEANER:
							appliance.add(createVacuumCleaner(applianceText));
							break;
					}

				}

			}

		}
		
		return appliance;
	}

	private Oven createOven(String applianceText){

		Map<String, String> values = new HashMap<>();

		for(SearchCriteria.Oven searchCriteriaOven : SearchCriteria.Oven.values()){

			values.put(searchCriteriaOven.name(), ApplianceFileReader.getValue(searchCriteriaOven.name(), applianceText));
		}

		return new Oven(values.get(SearchCriteria.Oven.values()[0].toString()),
				values.get(SearchCriteria.Oven.values()[1].toString()),
				values.get(SearchCriteria.Oven.values()[2].toString()),
				values.get(SearchCriteria.Oven.values()[3].toString()),
				values.get(SearchCriteria.Oven.values()[4].toString()),
				values.get(SearchCriteria.Oven.values()[5].toString()));
	}


	private Laptop createLaptop(String applianceText){

		Map<String, String> values = new HashMap<>();

		for(SearchCriteria.Laptop searchCriteriaLaptop : SearchCriteria.Laptop.values()){

			values.put(searchCriteriaLaptop.name(), ApplianceFileReader.getValue(searchCriteriaLaptop.name(), applianceText));
		}

		return new Laptop(values.get(SearchCriteria.Laptop.values()[0].toString()),
				values.get(SearchCriteria.Laptop.values()[1].toString()),
				values.get(SearchCriteria.Laptop.values()[2].toString()),
				values.get(SearchCriteria.Laptop.values()[3].toString()),
				values.get(SearchCriteria.Laptop.values()[4].toString()));
	}


	private Refrigerator createRefrigerator(String applianceText){

		Map<String, String> values = new HashMap<>();

		for(SearchCriteria.Refrigerator searchCriteriaRefrigerator : SearchCriteria.Refrigerator.values()){

			values.put(searchCriteriaRefrigerator.name(), ApplianceFileReader.getValue(searchCriteriaRefrigerator.name(),
					applianceText));
		}

		return new Refrigerator(values.get(SearchCriteria.Refrigerator.values()[0].toString()),
				values.get(SearchCriteria.Refrigerator.values()[1].toString()),
				values.get(SearchCriteria.Refrigerator.values()[2].toString()),
				values.get(SearchCriteria.Refrigerator.values()[3].toString()),
				values.get(SearchCriteria.Refrigerator.values()[4].toString()),
				values.get(SearchCriteria.Refrigerator.values()[5].toString()));

	}

	private TabletPC createTabletPC(String applianceText){

		Map<String, String> values = new HashMap<>();

		for(SearchCriteria.TabletPC searchCriteriaTabletPC : SearchCriteria.TabletPC.values()){

			values.put(searchCriteriaTabletPC.name(), ApplianceFileReader.getValue(searchCriteriaTabletPC.name(),
					applianceText));
		}

		return new TabletPC(values.get(SearchCriteria.TabletPC.values()[0].toString()),
				values.get(SearchCriteria.TabletPC.values()[1].toString()),
				values.get(SearchCriteria.TabletPC.values()[2].toString()),
				values.get(SearchCriteria.TabletPC.values()[3].toString()),
				values.get(SearchCriteria.TabletPC.values()[4].toString()));


	}

	private VacuumCleaner createVacuumCleaner(String applianceText){

		Map<String, String> values = new HashMap<>();

		for(SearchCriteria.VacuumCleaner searchCriteriaVacuumCleaner : SearchCriteria.VacuumCleaner.values()){

			values.put(searchCriteriaVacuumCleaner.name(), ApplianceFileReader.getValue(searchCriteriaVacuumCleaner.name(),
					applianceText));
		}

		return new VacuumCleaner(values.get(SearchCriteria.VacuumCleaner.values()[0].toString()),
				values.get(SearchCriteria.VacuumCleaner.values()[1].toString()),
				values.get(SearchCriteria.VacuumCleaner.values()[2].toString()),
				values.get(SearchCriteria.VacuumCleaner.values()[3].toString()),
				values.get(SearchCriteria.VacuumCleaner.values()[4].toString()),
				values.get(SearchCriteria.VacuumCleaner.values()[5].toString()));

	}

	private Speakers createSpeakers(String applianceText){

		Map<String, String> values = new HashMap<>();

		for(SearchCriteria.Speakers searchCriteriaSpeakers : SearchCriteria.Speakers.values()){

			values.put(searchCriteriaSpeakers.name(), ApplianceFileReader.getValue(searchCriteriaSpeakers.name(),
					applianceText));
		}

		return new Speakers(values.get(SearchCriteria.Speakers.values()[0].toString()),
				values.get(SearchCriteria.Speakers.values()[1].toString()),
				values.get(SearchCriteria.Speakers.values()[2].toString()),
				values.get(SearchCriteria.Speakers.values()[3].toString()));


	}


}
