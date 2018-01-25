package by.tc.shved.task01.entity;

public class VacuumCleaner extends Appliance{

    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(String powerConsumption, String filterType, String bagType,
                         String wandType, String motorSpeedRegulation, String cleaningWidth) {
        this.powerConsumption = Double.parseDouble(powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = Double.parseDouble(motorSpeedRegulation);
        this.cleaningWidth = Double.parseDouble(cleaningWidth);
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "\npowerConsumption=" + powerConsumption +
                ",\n filterType='" + filterType + '\'' +
                ",\n bagType='" + bagType + '\'' +
                ",\n wandType='" + wandType + '\'' +
                ",\n motorSpeedRegulation=" + motorSpeedRegulation +
                ",\n cleaningWidth=" + cleaningWidth +
                '}';
    }
}
