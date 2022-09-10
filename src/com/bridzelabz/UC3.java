package com.bridzelabz;

public class UC3 {
    public static void main(String[] args) {

        int Is_Full_Time = 1;
        int Is_Part_Time =2;

        int Emp_Rate_Per_Hrs = 20;

        int Emp_hrs = 0;

        int Emp_wage=0;

        double empCheck = Math.floor(Math.random() * 10)%2;

        if (empCheck == Is_Full_Time)
        {
            System.out.println("Employee is Full time ");
            Emp_hrs = 8;
            Emp_wage = Emp_Rate_Per_Hrs * Emp_hrs;
            System.out.println("Employe wage salary is " + Emp_wage);
        } else if (empCheck == Is_Part_Time) {
            System.out.println("Employe is part time");
            Emp_hrs =4;
            Emp_wage =Emp_Rate_Per_Hrs * Emp_hrs;
            System.out.println(Emp_wage);
        } else {
            System.out.println("Employee is absent ");
            Emp_hrs = 0;
            Emp_wage = Emp_Rate_Per_Hrs * Emp_hrs;
            System.out.println(Emp_wage);
        }
    }
}
