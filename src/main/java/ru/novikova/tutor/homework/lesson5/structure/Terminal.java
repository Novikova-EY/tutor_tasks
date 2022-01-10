package ru.novikova.tutor.homework.lesson5.structure;

import java.io.IOException;
import java.util.ArrayList;

// 5 терминалов
public class Terminal {
    private String terminalName;
    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Aircraft> aircrafts = new ArrayList<>();

    public Terminal(String terminalName) throws IOException {
        this.terminalName = terminalName;
        aircraftRepository();
        flightRepository();
    }

    private void aircraftRepository() {
        for (int i = 0; i < 10; i++) {
            aircrafts.add(new Aircraft());
        }
    }

    private void flightRepository() throws IOException {
        for (int i = 0; i < 10; i++) {
            flights.add(new Flight());
        }
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Aircraft> getAircrafts() {
        return aircrafts;
    }

    @Override
    public String toString() {
        return terminalName + "\n Flights: \n" + flights + "\n Aircrafts: \n" + aircrafts + "\n";
    }
}
