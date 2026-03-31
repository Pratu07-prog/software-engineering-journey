package com.Javabasics;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class morgageCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int principal, period;
        float annualInterestRate;
        while(true){
            System.out.print("Principal(1000rs - 1000000rs): ");
            principal = sc.nextInt();
            if(principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a number between 1000 and 1000000");
        }
        while(true)
        {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = sc.nextFloat();
            if(annualInterestRate > 0 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
        while(true)
        {
            System.out.print("Period(Years): ");
            period = sc.nextInt();
            if(period > 0 && period <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        double mortgage;
        int MONTHS = 12;
        int PERCENT = 100;
        float monthlyInterest = annualInterestRate/MONTHS/PERCENT;
        int tenureInMonths = period*MONTHS;
        mortgage = principal*monthlyInterest*Math.pow((1+monthlyInterest), tenureInMonths) / (Math.pow((1+monthlyInterest), tenureInMonths) - 1);
        String roundedValue = String.format("%.2f", mortgage);
        System.out.println("Mortgage: " + roundedValue);
//        Mortgage: = P r(1+r)^n / (1+r)^n - 1
//        rate = rate/100/12;
//        tenure = tenure*12;
    }
}