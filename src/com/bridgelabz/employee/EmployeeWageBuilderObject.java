package com.bridgelabz.employee;

public class EmployeeWageBuilderObject {
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHourPerMonth;
    public final String company;

    EmployeeWageBuilderObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;
    }

    public static void main(String[] args)
        {
            EmployeeWageBuilderObject vmart = new EmployeeWageBuilderObject("vmart", 20,
                    20, 100);
        int totalEmpWage = 0, empHrs = 0, totalEmpHrs = 0;
        int totalWorkingDay = 0;
        while (totalEmpHrs <= vmart.maxHourPerMonth && totalWorkingDay < vmart.numOfWorkingDays) {
            totalWorkingDay++;
            int empType = (int) (Math.random() * 10) % 3;
            switch (empType) {
                case FULL_TIME:
                    empHrs = 8;
                    break;
                case PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs =totalEmpHrs+ empHrs;
            System.out.println("day#: " + totalWorkingDay + " Emp hr : " + empHrs);
        }
        totalEmpWage = totalEmpHrs * vmart.empRatePerHour;
        System.out.println("Total Emp wage for  company "+vmart.company+ " is : " + totalEmpWage);
    }
}