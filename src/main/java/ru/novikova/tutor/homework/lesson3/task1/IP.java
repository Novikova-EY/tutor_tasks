package ru.novikova.tutor.homework.lesson3.task1;

public class IP extends Client {

    public IP(int sum) {
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
        double com = sumToPut * 0.1;
        if (sumToPut < 1000) {
            this.sum += sumToPut;
            this.sum -= com;
            System.out.println("Внесение денежных средств в размере " + sumToPut + " руб. " +
                    "комиссия - " + com + " руб.");
        } else {
            this.sum += sumToPut;
            com = sumToPut * 0.05;
            this.sum -= com;
            System.out.println("Внесение денежных средств в размере " + sumToPut + " руб. " +
                    "комиссия - " + com + " руб.");
        }
        getSum();
    }

    @Override
    public void getInfo() {
        System.out.println("Условия обслуживания: снятие - без комиссии, пополнение с комиссией 1%, если сумма меньше 1000 рублей " +
                "и с комиссией 0,5%, если сумма больше либо равна 1000 рублей.");
        this.getSum();
    }

}
