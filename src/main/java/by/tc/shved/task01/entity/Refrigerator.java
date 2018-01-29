package by.tc.shved.task01.entity;


import java.util.Objects;

public class Refrigerator implements Appliance{

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

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getFreezeCapacity() {
        return freezeCapacity;
    }

    public double getOveralCapacity() {
        return overalCapacity;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 &&
                Double.compare(that.weight, weight) == 0 &&
                Double.compare(that.freezeCapacity, freezeCapacity) == 0 &&
                Double.compare(that.overalCapacity, overalCapacity) == 0 &&
                Double.compare(that.height, height) == 0 &&
                Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(powerConsumption, weight, freezeCapacity, overalCapacity, height, width);
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

