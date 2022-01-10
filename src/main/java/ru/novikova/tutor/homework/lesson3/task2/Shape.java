package ru.novikova.tutor.homework.lesson3.task2;

public abstract class Shape implements CountPerimetr, CountSquare{
    String coordinates;

    double square;
    double perimetr;

    public Shape(String coordinates) {
        this.coordinates = coordinates;
    }

    public abstract void draw();

}
