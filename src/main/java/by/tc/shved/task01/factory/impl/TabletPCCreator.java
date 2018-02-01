package by.tc.shved.task01.factory.impl;

import by.tc.shved.task01.factory.ApplianceCreator;
import by.tc.shved.task01.entity.TabletPC;
import by.tc.shved.task01.entity.criteria.SearchCriteria;
import by.tc.shved.task01.parser.ApplianceFileReader;

import java.util.HashMap;
import java.util.Map;

public class TabletPCCreator implements ApplianceCreator {

    @Override
    public TabletPC create(String applianceText){

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
}
