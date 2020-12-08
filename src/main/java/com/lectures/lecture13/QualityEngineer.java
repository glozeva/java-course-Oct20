package com.lectures.lecture13;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QualityEngineer extends Employee {

    private static final String EMPLOYEE_POSITION_NAME = "Quality Assurance Engineer";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Quality Assurance";

    @Getter
    private boolean isTestAutomationExpert;

    public QualityEngineer(String name, int employeeId) {
        super(name, employeeId, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    public QualityEngineer(String name, int employeeId, boolean isTestAutomationExpert) {
        super(name, employeeId, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
        this.isTestAutomationExpert = isTestAutomationExpert;
    }

    public int getSalary(int workedDays, int dailyGrossRate, int bonus){
        return calculateEmployeeMonthlySalaryWithBonus(workedDays, dailyGrossRate, bonus);
    }

    public int getSalary(int workedDays, int dailyGrossRate){
        return super.calculateEmployeeMonthlySalaryWithBonus(workedDays, dailyGrossRate, 2000);
    }

    protected int calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate, int bonus) {
//        return super.calculateEmployeeMonthlySalaryWithBonus(workedDays, dailyGrossRate, bonus);
        log.info("Salary is: " + 3500);
        return 3500;
    }

}
