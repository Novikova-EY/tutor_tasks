package ru.novikova.tutor.homework.lesson3.task1;

public class FL extends Client {
    public FL(int sum) {
        super(sum);
    }

    @Override
    public void takeSum(int sumToTake) {
        if (sumToTake <= this.sum) {
            this.sum -= sumToTake;
            System.out.println("Снятие денежных средств в размере " + sumToTake + " руб.");
            getSum();
        } else {
            System.out.println("Недостаточно средств на счете.");
        }
    }

    @Override
    public void putSum(int sumToPut) {
        this.sum += sumToPut;
        System.out.println("Внесение денежных средств в размере " + sumToPut + " руб.");
        getSum();
    }

    @Override
    public void getInfo() {
        System.out.println("Условия обслуживания: снятие и пополнение без комиссии");
        this.getSum();
    }

}
