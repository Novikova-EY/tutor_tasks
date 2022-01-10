package ru.novikova.tutor.homework.lesson3.task2;

public class Rectangle extends Shape {
    int side;

    public Rectangle(String coordinates) {
        super(coordinates);
    }

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник с координатами - " + this.coordinates);
    }

    @Override
    public void countP() {
        System.out.println("Вычисление периметра треугольника");
    }

    @Override
    public void countS() {
        System.out.println("Вычисление площади треугольника");
    }
}
