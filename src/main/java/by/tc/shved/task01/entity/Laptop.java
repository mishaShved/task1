package by.tc.shved.task01.entity;

public class Laptop extends Appliance{

    private double batteryCapacity;
    private String os;
    private double memoryRoom;
    private double cpu;
    private double displayInch;

    public Laptop() {
    }

    public Laptop(String batteryCapacity, String os, String memoryRoom, String cpu, String displayInch) {
        this.batteryCapacity = Double.parseDouble(batteryCapacity);
        this.os = os;
        this.memoryRoom = Double.parseDouble(memoryRoom);
        this.cpu = Double.parseDouble(cpu);
        this.displayInch = Double.parseDouble(displayInch);
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "\n batteryCapacity=" + batteryCapacity +
                ",\n  os='" + os + '\'' +
                ",\n  memoryRoom=" + memoryRoom +
                ",\n  cpu=" + cpu +
                ",\n  displayInch=" + displayInch +
                '}';
    }
}

