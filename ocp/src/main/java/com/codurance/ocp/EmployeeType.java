package com.codurance.ocp;

public abstract class EmployeeType {
    final static EmployeeType MANAGER = null;
    final static EmployeeType ENGINEER = new Engineer();


    abstract int payAmount(Employee employee);
}
