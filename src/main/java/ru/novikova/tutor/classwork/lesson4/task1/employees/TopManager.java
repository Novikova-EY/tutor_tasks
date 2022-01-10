package ru.novikova.tutor.classwork.lesson4.task1.employees;


import java.util.Date;

public class TopManager extends AbstractEmployee implements Employee{

    public TopManager(Date dataEmployee, long id, int salary) {
        super(dataEmployee, id, salary);
    }

    public TopManager() {
    }

    @Override
    public void getMonthSalary() {
        super.setSalary(super.getSalary() * 25 / 10);
    }

    @Override
    public String toString() {
        return "TopManager" + super.toString();
    }
}
