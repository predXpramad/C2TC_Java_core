package com.prasad.assignment.utilities;
import com.prasad.assignment.employees.Developer;
import com.prasad.assignment.employees.Employee;
import com.prasad.assignment.employees.Manager;

public class EmployeeUtilities {

    public static void increaseSalary(Employee employee, double percentage) {
        double currentSalary = employee.getSalary();
        double increaseAmount = currentSalary * (percentage / 100);
        employee.setSalary(currentSalary + increaseAmount);
    }

    public static void printEmployeeDetails(Employee employee) {
        System.out.println("---------------------------------");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.printf("Salary: $%.2f%n", employee.getSalary());

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Role: Manager");
            System.out.println("Team Size: " + manager.getTeamSize());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Role: Developer");
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
        System.out.println("---------------------------------");
    }
}
