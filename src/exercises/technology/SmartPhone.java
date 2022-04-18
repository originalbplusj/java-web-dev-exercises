package exercises.technology;

public class SmartPhone extends Computer {
    private String carrier;
    private boolean onNetwork;


    public SmartPhone(String modelName, double memoryAvailable, double os, String carrier){
        super(modelName,  memoryAvailable, os);
        this.carrier = carrier;
    }

    public boolean findSignal(){
        return onNetwork = true;
        //System.out.println("You are on the network");
    }

}
