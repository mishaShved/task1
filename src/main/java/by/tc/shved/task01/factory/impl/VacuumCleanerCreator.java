package by.tc.shved.task01.factory.impl;

import by.tc.shved.task01.factory.ApplianceCreator;
import by.tc.shved.task01.entity.VacuumCleaner;
import by.tc.shved.task01.entity.criteria.SearchCriteria;
import by.tc.shved.task01.parser.ApplianceFileReader;

import java.util.HashMap;
import java.util.Map;

public class VacuumCleanerCreator extends ApplianceCreator {

    @Override
    public VacuumCleaner create(String applianceText){

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

}
