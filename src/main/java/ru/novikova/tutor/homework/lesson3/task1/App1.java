package ru.novikova.tutor.homework.lesson3.task1;

public class App1 {
    public static void main(String[] args) {

        FL fl = new FL(10);
        fl.getSum();
        fl.getInfo();
        fl.putSum(10);
        fl.takeSum(200);
        fl.takeSum(5);
        fl.takeAll();

        UL ul = new UL(1000);
        ul.getSum();
        ul.getInfo();
        ul.putSum(100);
        ul.takeSum(2000);
        ul.takeSum(50);
        ul.takeAll();

        IP ip = new IP(1000);
        ip.getSum();
        ip.getInfo();
        ip.putSum(100);
        ip.takeSum(2000);
        ip.takeSum(50);
        ip.takeAll();
    }
}
