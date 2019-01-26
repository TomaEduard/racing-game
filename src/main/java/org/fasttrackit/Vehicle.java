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
    private double fuelLevel;
    private double totalTraveledDistance;

//      Constructors

    public Vehicle() {
        vehicleCount++;
    }

    //      Methods

    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " accelerated with " + speed +
                " km/h for " + durationInHours + " hours.");
        double traveledDistance = speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance + " km.");
        totalTraveledDistance += traveledDistance;
        System.out.println("Total traveled distance: " + totalTraveledDistance);

        double spentFuel = traveledDistance * mileage /100;
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel: " + fuelLevel);
        return traveledDistance;
    }

    public double accelerate(double speed) {
        return accelerate(speed, 1);
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

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalTraveledDistance() {
        return totalTraveledDistance;
    }

    public void setTotalTraveledDistance(double totalTraveledDistance) {
        this.totalTraveledDistance = totalTraveledDistance;
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
}
