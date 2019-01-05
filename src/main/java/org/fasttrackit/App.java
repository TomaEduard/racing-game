package org.fasttrackit;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        /*
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        engine.expiryDate = LocalDateTime.now().plusYears(10);


//        Car
        Car Dacia = new Car(engine);
        Dacia.setName("Dacia");
        Dacia.setColor("Whitee");
        Dacia.setMileage(9.5);
        Dacia.setWheelCount(4);
        Dacia.setRunning(true);
        Dacia.setDoorCount(4);
//        Dacia.CONTROL_TYPE = "updated";

        Car skoda = new Car(engine);
        skoda.setName("Skoda");
        skoda.setName("Skoda Fabia");
//        skoda.CONTROL_TYPE = "ttfgf";


        Dacia.accelerate(44.1, 4.30);

        System.out.println("Control type referenced from firstCar object: " + Dacia.CONTROL_TYPE);
        System.out.println("Control type referenced from firstCar object: " + skoda.CONTROL_TYPE);
*/

        AutoVehicle ford = new AutoVehicle();
        ford.setName("Ford");
        System.out.println(ford.toString());


/*
//        UFO
        UFO ufo = new UFO();


        double carTraveledDistance = car.accelerate(100, 2);



        // Ctrl+Alt+L          reformat code
        //Ctrl+shfift+v

*/

    }
}
