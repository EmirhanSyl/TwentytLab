package com.blackflower.twentytlab;

public class Employee {
    String firstName;
    String lastName;;
    int salary;

    public Employee(int salary) {
        this.salary = salary;
    }
    
    String GetName(){
        return firstName + " " + lastName;
    }
}
