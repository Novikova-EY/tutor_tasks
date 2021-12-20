package ru.novikova.tutor.homework.lesson3.task2;

public class App2 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("11"),
                new Rectangle("22"),
                new Circle("33"),
                new Rectangle("44")};

        for (Shape s : shapes) {
            s.draw();
        }
        for (Shape s : shapes) {
            s.countP();
        }
        for (Shape s : shapes) {
            s.countS();
        }
    }
}
