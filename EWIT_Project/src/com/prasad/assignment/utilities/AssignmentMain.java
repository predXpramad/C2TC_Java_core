package com.prasad.assignment.utilities;

import com.prasad.assignment.employees.Developer;
import com.prasad.assignment.employees.Manager;
import com.prasad.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "MGR123", 90000, 10);
        Developer developer = new Developer("Bob", "DEV456", 75000, "Java");

        System.out.println("--- Initial Employee Details ---");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        System.out.println("\n--- Increasing Salaries by 10% ---");
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 10);
        System.out.println("Salaries updated.\n");

        System.out.println("--- Employee Details After Salary Increase ---");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}