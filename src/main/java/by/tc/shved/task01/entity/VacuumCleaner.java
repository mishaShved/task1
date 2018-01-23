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
