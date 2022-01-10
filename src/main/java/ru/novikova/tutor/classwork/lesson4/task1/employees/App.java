package ru.novikova.tutor.classwork.lesson4.task1.employees;

public class App {
    public static void main(String[] args) {
        Manager manager = new Manager();
        if (manager instanceof AbstractEmployee) {
            System.out.println("hello world");
        }
        if (manager.getClass() == Manager.class) {
            System.out.println("AbstractEmployee.class = " + AbstractEmployee.class);
            System.out.println("Manager.class = " + Manager.class);
            System.out.println("hello world");
        }

    }
}
