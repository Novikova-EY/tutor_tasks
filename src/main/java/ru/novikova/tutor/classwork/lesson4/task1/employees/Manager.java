package ru.novikova.tutor.classwork.lesson4.task1.employees;

import java.util.Date;

public class Manager extends AbstractEmployee {

    private int salaryManager;
    private int sumIncome = (int) (Math.random() * 25000) + 115000;

    public Manager(Date dataEmployee, long id, int salaryManager) {
        super(dataEmployee, id, salaryManager);
        this.salaryManager = getMonthSalary();
    }

    public Manager() {}

    public int getMonthSalary() {
        int sum = sumIncome;
        sumIncome = sum * 95 / 100;
        return salaryManager + (sum * 5 / 100);
    }

    public int getSumIncome() {
        return sumIncome;
    }

    @Override
    public String toString() {
        return "Manager" + super.toString();
    }
}
