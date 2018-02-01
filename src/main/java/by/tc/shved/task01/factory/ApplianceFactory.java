package by.tc.shved.task01.factory;

import by.tc.shved.task01.factory.impl.*;
import by.tc.shved.task01.entity.criteria.ApplianceType;

public class ApplianceFactory {
    private static final ApplianceFactory ourInstance = new ApplianceFactory();

    public static ApplianceFactory getInstance() {
        return ourInstance;
    }

    private ApplianceFactory() {
    }

    public ApplianceCreator getCreator(ApplianceType type){

        ApplianceCreator applianceCreator = null;

        switch (type) {

            case OVEN:
                applianceCreator = new OvenCreator();
                break;
            case LAPTOP:
                applianceCreator = new LaptopCreator();
                break;
            case SPEAKERS:
                applianceCreator = new SpeakersCreator();
                break;
            case TABLET_PC:
                applianceCreator = new TabletPCCreator();
                break;
            case REFRIGERATOR:
                applianceCreator = new RefrigeratorCreator();
                break;
            case VACUUM_CLEANER:
                applianceCreator = new VacuumCleanerCreator();
                break;
        }

        return applianceCreator;
    }
}
