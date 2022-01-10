package ru.novikova.tutor.classwork.lesson4.task1;

import ru.novikova.tutor.classwork.lesson4.task1.employees.AbstractEmployee;
import ru.novikova.tutor.classwork.lesson4.task1.employees.Manager;
import ru.novikova.tutor.classwork.lesson4.task1.employees.TopManager;

import java.util.ArrayList;
import java.util.Comparator;

public class Company {

    private int sumIncomeCompany;
    private ArrayList<AbstractEmployee> companyEmployees = new ArrayList<>();

    public void hire(AbstractEmployee abstractEmployee) {
        if (abstractEmployee != null) {
            companyEmployees.add(abstractEmployee);
            getIncome();
            salaryTopManager();
        }
    }

    public void hireAll(ArrayList<AbstractEmployee> abstractEmployees) {
        companyEmployees.addAll(abstractEmployees);
    }

    public void fire(AbstractEmployee abstractEmployee){
        companyEmployees.remove(abstractEmployee);
    }

    public void getIncome(){
        int sum = 0;
        for (AbstractEmployee ae : this.companyEmployees) {
            if (ae.getClass() == Manager.class) {
                ((Manager) ae).getMonthSalary();
                sum += ((Manager) ae).getSumIncome();

            }
        }
        this.sumIncomeCompany = sum;
    }

    public int getSumIncomeCompany() {
        return sumIncomeCompany;
    }

    public void salaryTopManager() {
        if (this.sumIncomeCompany > 10000000) {
            for (AbstractEmployee ae : this.companyEmployees) {
                if (ae.getClass() == TopManager.class) {
                    ((TopManager) ae).getMonthSalary();
                }
            }
        }
    }

    public ArrayList<AbstractEmployee> getCompanyEmployees() {
        return companyEmployees;
    }

    public void getTopSalaryStaff(int count) {
        companyEmployees.sort(new Comparator<AbstractEmployee>() {
            @Override
            public int compare(AbstractEmployee o1, AbstractEmployee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        for (int i = 0; i < count; i++) {
            System.out.println(companyEmployees.get(i).getSalary());
        }
    }

    public void getLowestSalaryStaff(int count) {
        companyEmployees.sort(new Comparator<AbstractEmployee>() {
            @Override
            public int compare(AbstractEmployee o1, AbstractEmployee o2) {
                return o2.getSalary() - o1.getSalary();
            }
        });
        for (int i = 0; i < count; i++) {
            System.out.println(companyEmployees.get(i).getSalary());
        }
    }
}
