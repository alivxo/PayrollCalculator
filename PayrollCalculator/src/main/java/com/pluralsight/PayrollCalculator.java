package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: " );
        String name = sc.nextLine();


        System.out.print("Enter hours worked: ");
        float workingHours = sc.nextFloat();


        System.out.print("Enter Pay Rate: ");
        float payRate = sc.nextFloat();


        float grossPay = workingHours * payRate;

        System.out.print("Your Pay Rate: $ " + grossPay );


    }

}
