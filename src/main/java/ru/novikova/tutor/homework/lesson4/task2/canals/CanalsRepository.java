package ru.novikova.tutor.homework.lesson4.task2.canals;

import ru.novikova.tutor.homework.lesson4.task2.Message;
import ru.novikova.tutor.homework.lesson4.task2.inputMessage.AttachedMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CanalsRepository {
    private Canal[] canal;
    private ArrayList<Canal> canals = new ArrayList<>();

    public CanalsRepository(Canal ... canal) {
        this.canal = canal;
    }

    public ArrayList<Canal> getCanals() {
        Collections.addAll(canals, canal);
        return canals;
    }
}
