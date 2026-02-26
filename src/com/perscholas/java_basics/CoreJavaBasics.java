package com.perscholas.java_basics;

import java.text.DecimalFormat;

public class CoreJavaBasics {

    public static void main(String[] args) {

        // 1. Two integers added
        int a = 10;
        int b = 20;
        int sumInt = a + b;
        System.out.println("Sum of integers: " + sumInt);

        // 2. Two doubles added
        double d1 = 5.5;
        double d2 = 10.25;
        double sumDouble = d1 + d2;
        System.out.println("Sum of doubles: " + sumDouble);

        // 3. Integer + Double
        int numInt = 7;
        double numDouble = 3.5;
        double mixedSum = numInt + numDouble; // must be double
        System.out.println("Sum of int + double: " + mixedSum);

        // 4. Integer division
        int larger = 15;
        int smaller = 4;
        int divisionResult = larger / smaller;
        System.out.println("Integer division result: " + divisionResult);

        // Change larger to decimal
        double largerDecimal = 15.0;
        double correctedDivision = largerDecimal / smaller;
        System.out.println("Corrected division result: " + correctedDivision);

        // 5. Double division + cast to int
        double x = 20.0;
        double y = 6.0;
        double resultDouble = x / y;
        System.out.println("Double division result: " + resultDouble);

        int castResult = (int) resultDouble;
        System.out.println("Casted to int: " + castResult);

        // 6. Casting example
        int xVal = 5;
        int yVal = 6;
        int q = yVal / xVal;
        System.out.println("q without casting: " + q);

        double qCast = (double) yVal / xVal;
        System.out.println("q with casting: " + qCast);

        // 7. Named constant
        final double PI = 3.14159;
        double area = PI * 5 * 5;
        System.out.println("Area using constant PI: " + area);

        // 8. Cafe order example
        double coffee = 3.50;
        double cappuccino = 4.25;
        double espresso = 2.75;

        double subtotal = (3 * coffee) + (4 * cappuccino) + (2 * espresso);

        final double SALES_TAX = 0.07;
        double totalSale = subtotal + (subtotal * SALES_TAX);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Total Sale (with tax): $" + df.format(totalSale));
    }
}