package exercises.technology;

public class Laptop extends Computer {

    private double batteryLevel;

    //constructor

    public Laptop(String modelName,  double memoryAvailable, double os,  double batteryLevel){

        super(modelName, memoryAvailable, os);
        this.batteryLevel = batteryLevel;

    }
    public boolean isCharged() {
        if (batteryLevel > 50) {
            return true;
        } else {
            return false;
        }
    }
}
