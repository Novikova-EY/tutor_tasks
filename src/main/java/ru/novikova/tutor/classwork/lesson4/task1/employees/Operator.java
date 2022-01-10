package ru.novikova.tutor.classwork.lesson4.task1.employees;


import java.util.Date;

public class Operator extends AbstractEmployee implements Employee{

    public Operator(Date dataEmployee, long id, int salary) {
        super(dataEmployee, id, salary);
    }

    public Operator() {
    }

    @Override
    public void getMonthSalary() {

    }

    @Override
    public String toString() {
        return this.getClass() + " " + super.toString();
    }
}
