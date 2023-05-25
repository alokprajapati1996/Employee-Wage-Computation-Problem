package com.bridgelabz.employee;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Wage Employee Computation Program");
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int NUM_WORKING_DAYS = 2;
        final int MAX_WORKING_HRS_MONTH= 10;

        int empWage = 0,empHrs=0,totalEmpWage=0,totalEmpHrs=0;
        int totalWorkingDay = 0;
        while(totalEmpHrs<=MAX_WORKING_HRS_MONTH && totalWorkingDay <= NUM_WORKING_DAYS)
        {
        totalWorkingDay++;
        int empType = (int) (Math.random() * 10) % 3;
               switch (empType)
            {
                case FULL_TIME:
                    empHrs = 8;
                    break;
                case PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs+= empHrs;
            empWage=empHrs*WAGE_PER_HR;
            totalEmpWage+=empWage;
        }
        System.out.println("Total wage for a month is " + totalEmpWage);
    }
}