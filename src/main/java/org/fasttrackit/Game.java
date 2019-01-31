package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    //    *List este o interfata. ArrayList este o clasa
//    Declaram o lista de competitori
//    Lista in comparatie cu sirul este o colectie nedeterminata
    private List<Vehicle> competitors = new ArrayList<>();
    //    Sir
    private Track[] tracks = new Track[10];


    //  Methods
    public void start() throws Exception {
        addCompetitors(getCompetitorsCountFromUser());
        displayCompetitors();

        addTracks();
        displayAvailableTracks();
    }

    private void addCompetitors(int competitorCount) {
        for (int i = 0; i < competitorCount; i++) {
            Vehicle vehicle = new Vehicle();

//          vehicle properties will be populate when we lern to get user's input
            vehicle.setName(getVehicleNameForUser());

            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(5.5, 15));

            System.out.println("Vehicle mileage :" + vehicle.getMileage());
            competitors.add(vehicle);
//          Adaugarea in lista cu metoda .add
        }
    }

    private int getCompetitorsCountFromUser() throws Exception {
        System.out.println("Please enter number of players: ");
        Scanner scanner = new Scanner(System.in);
        try {

            int numberOfPlayers = scanner.nextInt();
            System.out.println("Selected number of players: "+ numberOfPlayers);
            return numberOfPlayers;
        } catch (InputMismatchException exception){
            throw new Exception("Integer required.");
        }
    }

    private String getVehicleNameForUser() {
        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your vehicle name is: " + name);
        return name;
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

        tracks[0] = track1;
        tracks[1] = track2;
    }

    private void displayAvailableTracks() {
        System.out.println("Available Tracks: ");
//fara = la <, pentru ca sirul are 10 elemente insa numerotarea incepe de la 0 si deci avem 0-9
//si daca este si =, atunci pozitia 10 nu exisa in sirul nostru !
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println(tracks[i].getName());
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

    public Track[] getTrack() {
        return tracks;
    }

    public void setTrack(Track[] track) {
        this.tracks = track;
    }

    public List<Vehicle> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<Vehicle> competitors) {
        this.competitors = competitors;
    }
}
