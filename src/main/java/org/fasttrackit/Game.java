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

        for (int i = 0 ; i < track.length; i++) {
            if (track[i] != null) {
                System.out.println(track[i].getName());
            }
        }

//        enchanced for /"for each"
        for (Track track : track) {
            if (track != null) {
                System.out.println(track.getName());
            }
        }
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
