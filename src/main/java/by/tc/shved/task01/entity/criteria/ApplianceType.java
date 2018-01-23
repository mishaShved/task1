/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.tc.shved.task01.entity.criteria;

/**
 *
 * @author misha
 */
public enum ApplianceType {
    OVEN, LAPTOP, REFRIGERATOR,
    VACUUM_CLEANER, TABLET_PC, SPEAKERS;

    @Override
    public String toString() {
        return name().toLowerCase().replace("_","");
    }

}
