package ru.novikova.tutor.homework.lesson3.task1;

public abstract class Client {
    double sum;

    public Client(int sum) {
        this.sum = sum;
    }

    public abstract void takeSum(int sumToTake);

    public abstract void putSum(int sumToPut);

    public abstract void getInfo();

    public void takeAll() {
        System.out.println("Возврат остатка денежных средств на счете - " + this.sum + " руб");
        this.sum = 0;
        getSum();
    };

    public void getSum() {
        System.out.println("Текущее состояние счета - " + this.sum + " руб");
    }
}
