package ru.novikova.tutor.homework.lesson3.task1;

public class UL extends Client{
    public UL(int sum) {
        super(sum);
    }

    @Override
    public void takeSum(int sumToTake) {
        if (sumToTake <= this.sum) {
            this.sum -= sumToTake;
            double com = sumToTake * 0.1;
            this.sum -= com;
            System.out.println("Снятие денежных средств в размере " + sumToTake + " руб. " +
                    "комиссия - " + com  + " руб.");
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
        System.out.println("Условия обслуживания: снятие - с комиссией 1%, пополнение без комиссии.");
        this.getSum();
    }
}
