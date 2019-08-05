package com.codurance.ocp;

public class Manager extends Employee {
    private final int bonus;

    public Manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public int payAmount() {
        return super.getSalary() + this.bonus;
    }
}
