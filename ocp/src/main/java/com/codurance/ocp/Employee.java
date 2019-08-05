package com.codurance.ocp;

public class Employee {

    private int salary;

    private int bonus;
    private EmployeeType type;

    protected Employee(int salary) {
        this.salary = salary;
    }

    public int payAmount() {
        switch (this.type) {
            case ENGINEER:
                return salary;
            case MANAGER:
                return salary + bonus;
            default:
                return 0;
        }
    }

    protected int getSalary() {
        return salary;
    }
}