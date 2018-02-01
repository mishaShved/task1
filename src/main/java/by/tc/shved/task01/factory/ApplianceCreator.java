package by.tc.shved.task01.factory;

import by.tc.shved.task01.entity.Appliance;

public interface ApplianceCreator {

    Appliance create(String applianceTextFormat);

}