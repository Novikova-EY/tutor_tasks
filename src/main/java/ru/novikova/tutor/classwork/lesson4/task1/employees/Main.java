package ru.novikova.tutor.classwork.lesson4.task1.employees;

import ru.novikova.tutor.classwork.lesson4.task1.Company;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        for (int i = 0; i < 180; i++) {
            company.hire(new Operator());
        }
        for (int i = 0; i < 100; i++) {
            company.hire(new Manager(new Date(), 1L, 20000));
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager(new Date(), 2L, 50000));
        }

        company.getIncome();
        System.out.println(company.getSumIncomeCompany());
        company.salaryTopManager();
        for (AbstractEmployee employee : company.getCompanyEmployees()) {
            System.out.println(employee.toString());
        }
    }
}
