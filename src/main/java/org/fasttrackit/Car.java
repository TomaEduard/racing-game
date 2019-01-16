package org.fasttrackit;

public class Car extends AutoVehicle {


    public static final String CONTROL_TYPE = "radio_controlled";

    private int doorCount;


    //    Constructori
//    Sa putem crea un obiect de tip Car doar cu parametru engine
    public Car(Engine engine) {
        super(engine);
    }

    //    Sa putem crea un obiect de tip Car si fara parametri engine
    public Car() {
        this(new Engine());
    }


//    Methods


    //  gather & setter
    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }


}


