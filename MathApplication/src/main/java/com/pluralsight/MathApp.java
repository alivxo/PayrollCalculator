package com.pluralsight;

import static java.lang.Math.*;

public class MathApp {
    public static void main(String[] args) {

    //Question 1
        int garySalary = 50000;
        int bobSalary = 60000;

        int highestSalary = max(garySalary, bobSalary);

        System.out.println("The highest salary is: " + highestSalary );

    // Question 2
        int carPrice = 31000;
        int truckPrice = 51000;

        int minPrice = min(carPrice, truckPrice);
        System.out.println("The minimum price is: " + minPrice );

    // Question 3

        double radius = 7.25F;
        double area = Math.PI * (Math.pow( radius ,2));
        System.out.println("The area is: " + area );

    // Question 4
         double squareVal = 5.0;
         double squareRoot = sqrt(squareVal);
         System.out.println("The square root is: " + squareRoot );

    // Question 5
         int x1 = 5;
         int y1 = 10;
         int x2 = 85;
         int y2 = 50;
         int distance = (int) (int) sqrt((pow(x2-x1,2) + pow(y2-y1,2)));
         System.out.println("The distance is: " + distance );








    }
}
