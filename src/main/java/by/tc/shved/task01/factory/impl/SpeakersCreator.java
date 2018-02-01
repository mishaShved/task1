package by.tc.shved.task01.factory.impl;

import by.tc.shved.task01.factory.ApplianceCreator;
import by.tc.shved.task01.entity.Speakers;
import by.tc.shved.task01.entity.criteria.SearchCriteria;
import by.tc.shved.task01.parser.ApplianceFileReader;

import java.util.HashMap;
import java.util.Map;

public class SpeakersCreator implements ApplianceCreator {

    @Override
    public Speakers create(String applianceText){

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
