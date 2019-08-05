package com.codurance.ocp;

public class Engineer extends EmployeeType {
    @Override
    int payAmount(Employee employee) {
        return employee.getSalary();
    }
}
