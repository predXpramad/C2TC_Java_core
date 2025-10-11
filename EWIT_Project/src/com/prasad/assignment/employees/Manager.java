package com.prasad.assignment.employees;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);  //The super keyword in Java is used within a subclass to refer to its immediate superclass (parent class)
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}