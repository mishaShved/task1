package by.tc.shved.task01.entity;


public class Refrigerator extends Appliance{

    private double powerConsumption;
    private double weight;
    private double freezeCapacity;
    private double overalCapacity;
    private double height;
    private double width;

    public Refrigerator() {
    }

    public Refrigerator(String powerConsumption, String weight, String freezeCapacity,
                        String overalCapacity, String height, String width) {
        this.powerConsumption = Double.parseDouble(powerConsumption);
        this.weight = Double.parseDouble(weight);
        this.freezeCapacity = Double.parseDouble(freezeCapacity);
        this.overalCapacity = Double.parseDouble(overalCapacity);
        this.height = Double.parseDouble(height);
        this.width = Double.parseDouble(width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "\n powerConsumption=" + powerConsumption +
                ",\n  weight=" + weight +
                ",\n  freezeCapacity=" + freezeCapacity +
                ",\n  overalCapacity=" + overalCapacity +
                ",\n  height=" + height +
                ",\n  width=" + width +
                '}';
    }
}

