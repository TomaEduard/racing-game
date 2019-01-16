package org.fasttrackit;

public class Car extends AutoVehicle {


    public static final String CONTROL_TYPE = "radio_controlled";

    private int doorCount;


    //    Constructori

    public Car(Engine engine) {
        super(engine);
    }


    //    Methods


    //  gather & setter
    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                "} " + super.toString();
    }
}


