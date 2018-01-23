package by.tc.shved.task01.entity;

public class Oven extends Appliance{

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