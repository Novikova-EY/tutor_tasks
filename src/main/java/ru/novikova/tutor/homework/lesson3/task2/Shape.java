package ru.novikova.tutor.homework.lesson3.task2;

public abstract class Shape implements Countable {
    String coordinates;

    public Shape(String coordinates) {
        this.coordinates = coordinates;
    }

    public abstract void draw();
}
