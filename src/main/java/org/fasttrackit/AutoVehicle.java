package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private Engine engine;
    private boolean running;

//    Constructor

    public AutoVehicle(Engine engine){
        this.engine = engine;
    }

    public AutoVehicle(Engine engine, String name){
        this.engine = engine;
        this.setName(name);
    }

    public AutoVehicle() {
        this(new Engine());
    }

//

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}

