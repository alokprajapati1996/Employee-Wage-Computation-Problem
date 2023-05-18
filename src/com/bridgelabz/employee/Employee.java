package com.bridgelabz.employee;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Wage Employee Computation Program");
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HRS = 20;
        int empHrs=0;
        int empWage=0;
        int empType = (int) (Math.random() * 10) % 3;

        if (empType == FULL_TIME) {
            System.out.println("Employee is Present Full time");
            empHrs = 8;
        } else if (empType == PART_TIME) {
            System.out.println("Employee is Present Part time");
            empHrs = 4;
        } else {
            System.out.println("Employee is Absent");

        }
        empWage=empHrs*WAGE_PER_HRS;
        System.out.println(empWage);
    }}
