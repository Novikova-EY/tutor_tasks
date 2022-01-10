package ru.novikova.tutor.homework.lesson5.structure;

import java.util.*;

public class Aircraft {
    private String aircraftModel;
    private int passengersCapacity;
    private LinkedHashMap<String, Integer> aircrafts;

    public Aircraft() {
        aircraftRepository();
        ArrayList<String> aircraftModels = new ArrayList<>(aircrafts.keySet());
        Random r = new Random();
        this.aircraftModel = aircraftModels.get(r.nextInt(aircraftModels.size()));
        this.passengersCapacity = aircrafts.get(aircraftModels.get(r.nextInt(aircraftModels.size())));
    }

    private void aircraftRepository() {
        aircrafts = new LinkedHashMap<>();
        aircrafts.put("Boeing 777-300ER", 531);
        aircrafts.put("Boeing 767-300", 336);
        aircrafts.put("Boeing 757-200", 238);
        aircrafts.put("Boeing 737-900ER", 215);
        aircrafts.put("Boeing 737-800", 189);
    }

    @Override
    public String toString() {
        return aircraftModel + passengersCapacity + "\n";
    }
}
