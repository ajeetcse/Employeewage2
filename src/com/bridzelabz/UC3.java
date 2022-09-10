package com.bridzelabz;

public class UC3 {
    public static void main(String[] args) {

        final int Is_Full_Time = 1;
        final int Is_Part_Time = 2;

        int Emp_Rate_Per_Hrs = 20;

        int Emp_hrs = 0;

        int Emp_wage = 0;
        int Emp_Working_Days = 20;
        int Month_Salary = 0;
        for (int i = 1; i < Emp_Working_Days; i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 2;
            switch (empCheck) {
                case Is_Full_Time:
                    System.out.println("Employee is Full time ");
                    Emp_hrs = 8;
                    Emp_wage = Emp_Rate_Per_Hrs * Emp_hrs;
                    System.out.println("Employe wage salary is " + Emp_wage);
                    break;
                case Is_Part_Time:
                    System.out.println("Employe is part time");
                    Emp_hrs = 4;
                    Emp_wage = Emp_Rate_Per_Hrs * Emp_hrs;
                    System.out.println(Emp_wage);
                    break;
                default:
                    System.out.println("Employee is absent ");
                    Emp_hrs = 0;
                    Emp_wage = Emp_Rate_Per_Hrs * Emp_hrs;
                    System.out.println(Emp_wage);
            }
            Month_Salary = Emp_wage+Month_Salary;
        }
        System.out.println("total month salary = "+Month_Salary);
    }
}
