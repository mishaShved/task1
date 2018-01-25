package by.tc.shved.task01.entity;

public class TabletPC extends Appliance{


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
