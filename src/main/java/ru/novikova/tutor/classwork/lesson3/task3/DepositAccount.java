package ru.novikova.tutor.classwork.lesson3.task3;

import java.util.Date;

public class DepositAccount extends BankAccount{
    private Date dateOfLastTakeOff;

    public DepositAccount(int sum) {
        super(sum);
    }

    public void takeSum(Date date, int sumToTake) {
        Date currentDate = date;
        Long h = currentDate.getTime() - (30L * 1000 * 60 * 60 * 24);
        Date g = new Date(h);
        if (date.after(g)) {
            super.takeSum(sumToTake);
        }
    }

    public void putSum(Date date, int sumToPut) {
        super.putSum(sumToPut);
        this.dateOfLastTakeOff = date;
    }
}
