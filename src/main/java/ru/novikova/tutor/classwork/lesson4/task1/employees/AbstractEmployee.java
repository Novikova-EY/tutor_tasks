package ru.novikova.tutor.classwork.lesson4.task1.employees;


import java.util.Date;

public  class AbstractEmployee{
    private Date dataEmployee;
    private long id;
    private int salary;

    public AbstractEmployee(Date dataEmployee, long id, int salary) {
        this.dataEmployee = dataEmployee;
        this.id = id;
        this.salary = salary;
    }

    public AbstractEmployee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "dataEmployee=" + dataEmployee +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
