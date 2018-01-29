package by.tc.shved.task01.entity;

import java.util.Objects;

public class Speakers implements Appliance{

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

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0 &&
                Double.compare(speakers.numberOfSpeakers, numberOfSpeakers) == 0 &&
                Double.compare(speakers.cordLength, cordLength) == 0 &&
                Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {

        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
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

