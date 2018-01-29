package by.tc.shved.task01.entity;

import java.util.Objects;

public class Oven implements Appliance{

    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
    }

    public Oven(String powerConsumption, String weight, String capacity,
                String depth, String height, String width) {
        this.powerConsumption = Double.parseDouble(powerConsumption);
        this.weight = Double.parseDouble(weight);
        this.capacity = Double.parseDouble(capacity);
        this.depth = Double.parseDouble(depth);
        this.height = Double.parseDouble(height);
        this.width = Double.parseDouble(width);
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
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
        Oven oven = (Oven) o;
        return Double.compare(oven.powerConsumption, powerConsumption) == 0 &&
                Double.compare(oven.weight, weight) == 0 &&
                Double.compare(oven.capacity, capacity) == 0 &&
                Double.compare(oven.depth, depth) == 0 &&
                Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "\n powerConsumption=" + powerConsumption +
                ",\n weight=" + weight +
                ",\n capacity=" + capacity +
                ",\n depth=" + depth +
                ",\n height=" + height +
                ",\n width=" + width +
                '}';
    }
}