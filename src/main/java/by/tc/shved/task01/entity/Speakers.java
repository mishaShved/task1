package by.tc.shved.task01.entity;

public class Speakers extends Appliance{

    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers() {
    }

    public Speakers(String powerConsumption, String numberOfSpeakers,
                    String frequencyRange, String cordLength) {
        this.powerConsumption = Double.parseDouble(powerConsumption);
        this.numberOfSpeakers = Double.parseDouble(numberOfSpeakers);
        this.frequencyRange = frequencyRange;
        this.cordLength = Double.parseDouble(cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "\n powerConsumption=" + powerConsumption +
                ",\n  numberOfSpeakers=" + numberOfSpeakers +
                ",\n  frequencyRange='" + frequencyRange + '\'' +
                ",\n  cordLength=" + cordLength +
                '}';
    }
}

