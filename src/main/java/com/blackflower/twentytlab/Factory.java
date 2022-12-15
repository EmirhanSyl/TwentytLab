package com.blackflower.twentytlab;

import java.util.ArrayList;

public class Factory {

    ArrayList<Employee> employees = new ArrayList<>();

    void AddEmployee(Employee emp) {
        employees.add(emp);
    }

    void PrintEmployeeType() {
        for (Employee employee : employees) {
            if (employee.getClass().equals(Employee.class)) {
                System.out.println(employee.GetName() + " is an Employee");
            } else {
                System.out.println(employee.GetName() + " is a Manager");
            }
        }
    }

    void PrintEmployeeTypeNumber() {
        int employeeCount = 0;
        int managerCount = 0;
        for (Employee employee : employees) {
            if (employee.getClass().equals(Employee.class)) {
                employeeCount++;
            } else {
                managerCount++;
            }
        }
        System.out.println("Employee count: " + employeeCount + ", Manager count: " + managerCount);
    }

    int GetTotalSalary() {
        int total = 0;
        for (Employee employee : employees) {
            total += employee.salary;
        }
        return total;
    }

    int GetTotalSalaryOfManagers() {
        int total = 0;
        for (Employee employee : employees) {
            if (employee.getClass().equals(Manager.class)) {
                total += employee.salary;
            }
        }
        return total;
    }
    
    void RemoveManagers() {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getClass().equals(Manager.class)) {
                employees.remove(i);
            }
        }
    }
}
