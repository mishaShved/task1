package by.tc.shved.task01.ApplianceFactory;

import by.tc.shved.task01.ApplianceFactory.ApplianceCreatorImpl.*;
import by.tc.shved.task01.entity.criteria.ApplianceType;

public class ApplianceFactory {
    private static ApplianceFactory ourInstance = new ApplianceFactory();

    public static ApplianceFactory getInstance() {
        return ourInstance;
    }

    private ApplianceFactory() {
    }

    public ApplainceCreator getCreator(ApplianceType type){

        ApplainceCreator applainceCreator = null;

        switch (type) {

            case OVEN:
                applainceCreator = new OvenCreator();
                break;
            case LAPTOP:
                applainceCreator = new LaptopCreator();
                break;
            case SPEAKERS:
                applainceCreator = new SpeakersCreator();
                break;
            case TABLET_PC:
                applainceCreator = new TabletPCCreator();
                break;
            case REFRIGERATOR:
                applainceCreator = new RefrigeratorCreator();
                break;
            case VACUUM_CLEANER:
                applainceCreator = new VacuumCleanerCreator();
                break;
        }

        return applainceCreator;
    }
}
