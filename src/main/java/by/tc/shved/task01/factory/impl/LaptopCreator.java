package by.tc.shved.task01.factory.impl;

import by.tc.shved.task01.factory.ApplainceCreator;
import by.tc.shved.task01.entity.Laptop;
import by.tc.shved.task01.entity.criteria.SearchCriteria;
import by.tc.shved.task01.parser.ApplianceFileReader;

import java.util.HashMap;
import java.util.Map;

public class LaptopCreator extends ApplainceCreator {

    @Override
    public Laptop create(String applianceText){

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

}
