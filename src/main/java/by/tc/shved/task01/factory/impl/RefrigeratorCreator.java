package by.tc.shved.task01.factory.impl;

import by.tc.shved.task01.factory.ApplianceCreator;
import by.tc.shved.task01.entity.Refrigerator;
import by.tc.shved.task01.entity.criteria.SearchCriteria;
import by.tc.shved.task01.parser.ApplianceFileReader;

import java.util.HashMap;
import java.util.Map;

public class RefrigeratorCreator extends ApplianceCreator {

    @Override
    public Refrigerator create(String applianceText){

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
}
