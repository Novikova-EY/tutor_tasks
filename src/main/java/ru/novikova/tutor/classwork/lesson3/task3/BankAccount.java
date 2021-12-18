package ru.novikova.tutor.classwork.lesson3.task3;

public class BankAccount {
    private int sum;

    public BankAccount(int sum) {
        this.sum = sum;
    }

    public void takeSum(int sumToTake) {
        if (sumToTake < this.sum) {
            this.sum -= sumToTake;
        }
    }

    public void putSum(int sumToPut) {
        this.sum += sumToPut;
    }

    public int getSum() {
        return sum;
    }
}
