package com.codurance.ocp;

public class Manager extends EmployeeType {
    @Override
    int payAmount(Employee employee) {
        return employee.getSalary()+employee.getBonus();
    }
}
