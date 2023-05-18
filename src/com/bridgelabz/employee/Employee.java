package com.bridgelabz.employee;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Wage Employee Computation Program");
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int PART_TIME = 1;
        int empType = (int) (Math.random() * 10) % 3;
        int workingHours = 0;
        switch (empType) {
                case FULL_TIME:
                System.out.println("Employee is Present Full time");
                workingHours = 8;
                break;
                case PART_TIME:
                System.out.println("Employee is Present Part time");
                workingHours = 4;
                break;
                default:
                System.out.println("Employee is Absent");
        }

                int wage = workingHours * WAGE_PER_HR;
                System.out.println("Employee Daily Wage is " + wage);
    }
}