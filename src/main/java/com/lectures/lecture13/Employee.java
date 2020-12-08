package com.lectures.lecture13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Slf4j
public abstract class Employee {

    private String name;
    private int employeeId;
    private String department;
    private String position;

    protected int calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate, int monthBonus){
        int calculatedSalary = calculateSalary(workedDays, dailyGrossRate) + monthBonus;
        log.info("The Employee {} has salary: {}", name, calculatedSalary);
        return calculatedSalary;
    }

    private int calculateSalary(int workedDays, int dailyGrossRate) {
        return workedDays * dailyGrossRate;
    }

    @Override
    public String toString() {
        return ("Employee: " + name + " with ID: " + employeeId + " on position " + position + " in department: " + department);
    }

    public int getDailyRate(){
        return 50;
    }

}
