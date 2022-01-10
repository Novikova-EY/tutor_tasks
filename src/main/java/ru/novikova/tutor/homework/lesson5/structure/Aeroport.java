package ru.novikova.tutor.homework.lesson5.structure;

import java.io.IOException;
import java.util.ArrayList;

public class Aeroport {
    private String aeroportName;
    private ArrayList<Terminal> terminals = new ArrayList<>();

    public Aeroport(String aeroportName) throws IOException {
        this.aeroportName = aeroportName;
        terminalsRepository();
    }

    private void terminalsRepository() throws IOException {
        for (int i = 0; i < 5; i++) {
            terminals.add(new Terminal("Terminal-" + i));
        }
    }

    @Override
    public String toString() {
        return aeroportName + "\n" + terminals + "\n";
    }
}
