package ru.novikova.tutor.classwork.lesson3.task3;

public class CardAccount extends BankAccount {
    private int count = 0;

    public CardAccount(int sum) {
        super(sum);
    }

    public void takeSum(int sumToTake) {
        if (sumToTake < super.getSum()) {
            super.takeSum(sumToTake);
            super.takeSum(sumToTake /100);
        }
    }

    public void putSum(int sumToPut) {
        count++;
        if (count%3 == 0) {
            super.putSum(sumToPut);
            super.putSum(3);
        } else {
            super.putSum(sumToPut);
        }

    }
}
