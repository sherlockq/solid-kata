package com.codurance.ocp;

public class Engineer extends Employee {
    public Engineer(int salary) {
        super(salary);
    }

    @Override
    public int payAmount() {
        return super.getSalary();
    }
}
