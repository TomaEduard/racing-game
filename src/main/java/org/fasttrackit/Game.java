package org.fasttrackit;

public class Game {

    private Track[] track = new Track[10];

    Vehicle firstCompetitor;
    Vehicle secondCompetitor;


//  Methods

    public void start() {
        addTracks();
        displayAvailableTracks();
    }

    private void addTracks() {
        Track track1 = new Track("Highway", 300);
        Track track2 = new Track("Seaside", 100);

        track[0] = track1;
        track[1] = track2;
    }

    private void displayAvailableTracks() {
        System.out.println("Available Tracks");
        System.out.println(track[0].getName());
        System.out.println(track[1].getName());
    }

    public Vehicle getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Vehicle firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Vehicle getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Vehicle secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
