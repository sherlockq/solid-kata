package com.codurance.ocp;

public class Employee {

    private int salary;
    private int bonus;
    private EmployeeType type;

    Employee(int salary, int bonus, EmployeeType type) {
        this.salary = salary;
        this.bonus = bonus;
        this.type = type;
    }

    int getSalary() {
        return salary;
    }

    public int payAmount() {
        return type.payAmount(this);
    }

    int getBonus() {
        return this.bonus;
    }
}