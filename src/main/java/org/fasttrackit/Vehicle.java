package org.fasttrackit;

public class Vehicle {

    //    Variablile de classa sunt caracterizate clasei, deci daca se modifica se
    //    va modifica peste tot unde este apelat.
    public static int vehicleCount;

    //    Variabile de instanta sunt caracterizate fiecarei obiect in parte
    private String name;
    private String color;
    private int wheelCount;
    private double mileage;


//      Constructors

    public Vehicle() {
        vehicleCount++;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //      Methods
     public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " accelerated with " + speed +
                " km/h for " + durationInHours + " hours.");
        double traveledDistance = speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance + " km.");
        return traveledDistance;
    }
     public double accelerate(double speed) {
        return accelerate(speed, 1);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", wheelCount=" + wheelCount +
                ", mileage=" + mileage +
                '}';
    }


//    getther/setther

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
