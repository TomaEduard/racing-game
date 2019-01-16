package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

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


        AutoVehicle ford = new AutoVehicle();
        ford.setName("Ford");
        System.out.println(ford.toString());


//        UFO
        UFO ufo = new UFO();


    */


//        Exemple of static variables unique for the whole application
        Vehicle vehicle1 = new Vehicle();
//        vehicle1.vehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
//        vehicle2.vehicleCount = 2;

//        Pentru ca variabila vehicleCount este statica, se poate apele de pe clasa
//        Acesta este modul recomandat, se poate apela si de pe obiecte, insa nu este recomandat
//        Vezi exeemplul vehicle1, vehicle2 cu warninguri !
//        Vehicle.vehicleCount = 3;

        System.out.println("Value for vehicle1: " + vehicle1.vehicleCount);
        System.out.println("Value for vehicle1: " + vehicle2.vehicleCount);
        System.out.println("Value for class: " + Vehicle.vehicleCount);



/*
        double carTraveledDistance = car.accelerate(100, 2);

Singurele variabile care nu primesc nici o valoare sunt variabilele locale
Variabilele declarate in interiorul unei metode

obiectele   null
numerele    0
boolean     false

        // Ctrl+Alt+L          reformat code
        //Ctrl+shfift+v

*/
    }
}
