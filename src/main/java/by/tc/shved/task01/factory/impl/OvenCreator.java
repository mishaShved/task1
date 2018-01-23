package by.tc.shved.task01.factory.impl;

import by.tc.shved.task01.factory.ApplainceCreator;
import by.tc.shved.task01.entity.Oven;
import by.tc.shved.task01.entity.criteria.SearchCriteria;
import by.tc.shved.task01.parser.ApplianceFileReader;

import java.util.HashMap;
import java.util.Map;

public class OvenCreator extends ApplainceCreator{

    @Override
    public Oven create(String applianceText){

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
}
