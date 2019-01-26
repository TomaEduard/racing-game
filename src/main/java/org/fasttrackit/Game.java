package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Track[] track = new Track[10];

    private List<Vehicle> competitors = new ArrayList<>();

    //  Methods

    public void start() {
        addCompetitors(3);
        displayCompetitors();

        addTracks();
        displayAvailableTracks();
    }

    private void addCompetitors(int competitorCount) {
        for (int i = 0; i < competitorCount; i++) {
            Vehicle vehicle = new Vehicle();
//          vehicle properties will be populate when we lern to get user's input
            competitors.add(vehicle);
//          Adaugarea in lista cu metoda .add
        }
    }

    private void displayCompetitors() {
        System.out.println("Welcome! Today's competitors are: ");
        for (int i = 0; i < competitors.size(); i++) {
            System.out.println(competitors.get(i).getName());
//            citirea din lista cu metoda .get(i).getName()
        }
    }

    private void addTracks() {
        Track track1 = new Track("Highway", 300);
        Track track2 = new Track("Seaside", 100);

        track[0] = track1;
        track[1] = track2;
    }

    private void displayAvailableTracks() {
        System.out.println("Available Tracks");
//fara = la <, pentru ca sirul are 10 elemente insa numerotarea incepe de la 0 si deci avem 0-9
//si daca este si =, atunci pozitia 10 nu exisa in sirul nostru !
        for (int i = 0; i < track.length; i++) {
            if (track[i] != null) {
                System.out.println(track[i].getName());
            }
        }

        /*
//        enchanced for "for each"
//        Ne protejeaza de: raise index out of bounds, infinit loop
//        pe fiecare unitate a sirului si in interior nu putem modifica intr-un fel sirul
        for (Track track : tracks) {
//        fiecare variabila din sir este stocata in "Track track"
//        Pentru fiecare obiect track din sirul : track
            if (track != null) {
                System.out.println(track.getName());
            }
        }
        */
    }

}
