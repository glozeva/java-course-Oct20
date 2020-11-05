package com.lectures.lecture01;

public class Employee {
    private int salary;
    private String employeeName;

    public void employeeSalary() {
        if (employeeName.equals("Ivan")) {
            salary = 1000;
//            System.out.println("Salary Ivan: " + salary);
        } else {
            salary = 5000;
//            System.out.println("Salary other: " + salary);
        }
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
