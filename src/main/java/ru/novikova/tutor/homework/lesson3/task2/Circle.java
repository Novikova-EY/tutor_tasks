package ru.novikova.tutor.homework.lesson3.task2;

public class Circle extends Shape {
    int radius;

    public Circle(String coordinates) {
        super(coordinates);
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с координатами - " + this.coordinates);
    }

    @Override
    public void countP() {
        System.out.println("Вычисление периметра круга");
    }

    @Override
    public void countS() {
        System.out.println("Вычисление площади круга");
    }
}
