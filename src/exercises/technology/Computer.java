package exercises.technology;

import org.w3c.dom.ls.LSOutput;

public class Computer extends AbstractEntity{

    private String modelName;
    private double memoryAvailable;
    private double os;
    private boolean wifiConnected = false;
    private double mediaSize;


    //constructor


    public Computer(String modelName, double memoryAvailable, double os){
        super();
        this.modelName = modelName;
        this.memoryAvailable = memoryAvailable;
        this.os = os;
    }








    //getters and setters

    public double getMemoryAvailable() {
        return memoryAvailable;
    }

    public void setMemoryAvailable(double memoryAvailable) {
        this.memoryAvailable = memoryAvailable;
    }

    public double getOs() {
        return os;
    }

    public void setOs(double os) {
        this.os = os;
    }

    //methods

    public double updateOs(){
        os = os + 0.1;
        return os;
    }

    public boolean connectWifi(){
       return wifiConnected = true;

    }

    public double downloadMedia(double mediaSize){
        if(mediaSize < memoryAvailable){
            memoryAvailable = memoryAvailable - mediaSize;
            System.out.println("Download complete");
        }else {
            System.out.println("Not enough memory available");
        }
        return memoryAvailable;
    }
}
