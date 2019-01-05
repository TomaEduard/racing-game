package org.fasttrackit;

public class Vehicle {

    private String name;
    private String color;
    private int wheelCount;
    private double mileage;


//      Constructors



    //      Methods
    protected double accelerate(double speed, double durationInHours) {
        System.out.println(name + " accelerated with " + speed +
                " km/h for " + durationInHours + " hours.");
        double traveledDistance = speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance + " km.");
        return traveledDistance;
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
