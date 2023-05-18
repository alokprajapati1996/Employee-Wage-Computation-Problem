package com.bridgelabz.employee;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Wage Employee Computation Program");
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HRS = 20;
        final int WORKING_DAYS = 20;
        int empHrs=0;
        int empWage=0;

        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++)
        {
            int empCheck = (int) (Math.random() * 10) % 3;
            int workingHours =0;
            switch (empCheck)
            {
                case FULL_TIME:
                    empHrs = 8;
                    break;
                case PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs=0;
            }
            empWage= empHrs * WAGE_PER_HRS;
            totalWage += empWage;
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}