package ru.novikova.tutor.homework.lesson6;

import java.util.ArrayList;

public class CartService {

    // should return list of entries (at least 10)
    public void getCartEntries(ArrayList<Entry> entries) {
        if (entries.size() >= 10) {
            System.out.println(entries);
        }
    }
}
