package com.blackflower.twentytlab;

public class TwentytLab {

    public static void main(String[] args) {
        Factory f = new Factory();
        
        Employee normalEmp1 = new Employee(5000);
        normalEmp1.firstName = "Emirhan";
        normalEmp1.lastName = "Soylu";
        
        Manager manager = new Manager();
        manager.firstName = "Manager";
        manager.lastName = "Soylu";
        
        f.AddEmployee(manager);
        f.AddEmployee(normalEmp1);
        
        f.PrintEmployeeType();
        f.PrintEmployeeTypeNumber();
        
        System.out.println(f.GetTotalSalary());
        System.out.println(f.GetTotalSalaryOfManagers());
        
        f.RemoveManagers();
    }
}
