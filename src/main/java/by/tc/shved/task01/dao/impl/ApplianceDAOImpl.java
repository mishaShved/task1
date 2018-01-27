package by.tc.shved.task01.dao.impl;

import by.tc.shved.task01.configuration.WorkerWithProperties;
import by.tc.shved.task01.entity.criteria.ApplianceType;
import by.tc.shved.task01.factory.ApplianceFactory;
import by.tc.shved.task01.dao.ApplianceDAO;
import by.tc.shved.task01.entity.Appliance;
import by.tc.shved.task01.entity.criteria.Criteria;
import by.tc.shved.task01.exception.WorkingWithDataSourceException;
import by.tc.shved.task01.parser.ApplianceFileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {


    private static ApplianceFactory factory = ApplianceFactory.getInstance();

    @Override
    public <E> List<Appliance> find(Criteria<E> criteria) throws WorkingWithDataSourceException {

        List<Appliance> searchResult = new ArrayList<>();

        String[] appliances = {};

        try {
            appliances = ApplianceFileReader.readFile(WorkerWithProperties.getOurInstance().getFileName());
        } catch (IOException e) {
            throw new WorkingWithDataSourceException();
        }


        boolean fitsCriteria;

        for (String applianceText : appliances) {

            if (isFitsCriteria(applianceText, criteria)) {

                createAppliance(searchResult, criteria.getApplianceType(), applianceText);

            }
        }


        return searchResult;
    }

    private void createAppliance(List<Appliance> searchResult, ApplianceType type, String applianceInTextFormat) {
        searchResult.add(factory.getCreator(type).create(applianceInTextFormat));
    }

    private <E> boolean isFitsCriteria(String applianceInTextFormat, Criteria<E> criteria) {

        boolean isFits = false;

        if (applianceInTextFormat.toLowerCase().startsWith(criteria.getApplianceType().toString())) {

            isFits = true;

            for (E criteriaKey : criteria.getKeySet()) {

                if (!ApplianceFileReader.getValue(criteriaKey.toString(), applianceInTextFormat)
                        .equalsIgnoreCase(criteria.getElement(criteriaKey).toString())) {

                    isFits = false;
                    break;
                }

            }

        }

        return isFits;
    }

}
