package com.lectures.lecture01;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        Employee employee = new Employee();
//        employee.setEmployeeName("Ivan");
//        System.out.println("salary from getter before method: " + employee.getSalary());
//        employee.employeeSalary();
//        System.out.println("salary from getter: " + employee.getSalary());

        String str = "This is my \"first\" string: %d";
        System.out.println(String.format(str,1));

    }


    private static void printEmployeeData(String name, int age, double salary) {
        if (age > 65) {
            System.out.println("Employee is ready to retire. Age is: " + age);
        } else {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }


}
