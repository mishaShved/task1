package by.tc.shved.task01.entity;

import java.util.Objects;

public class TabletPC implements Appliance{


    private double batteryCapacity;
    private double displayInches;
    private double memoryRoom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(String batteryCapacity, String displayInches,
                    String memoryRoom, String flashMemoryCapacity, String color) {
        this.batteryCapacity = Double.parseDouble(batteryCapacity);
        this.displayInches = Double.parseDouble(displayInches);
        this.memoryRoom = Double.parseDouble(memoryRoom);
        this.flashMemoryCapacity = Double.parseDouble(flashMemoryCapacity);
        this.color = color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public double getMemoryRoom() {
        return memoryRoom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(tabletPC.displayInches, displayInches) == 0 &&
                Double.compare(tabletPC.memoryRoom, memoryRoom) == 0 &&
                Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0 &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(batteryCapacity, displayInches, memoryRoom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "\nbatteryCapacity=" + batteryCapacity +
                ",\n displayInches=" + displayInches +
                ",\n memoryRoom=" + memoryRoom +
                ",\n flashMemoryCapacity=" + flashMemoryCapacity +
                ",\n  color='" + color + '\'' +
                '}';
    }
}
