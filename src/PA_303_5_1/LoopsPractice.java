package PA_303_5_1;

import java.util.Scanner;

public class LoopsPractice {

    public static void main(String[] args) {

        printMultiplicationTable();
        findGCD();
        predictTuition();
    }

    // -------------------------------
    // 1️⃣ Multiplication Table
    // -------------------------------
    public static void printMultiplicationTable() {
        System.out.println("----- Multiplication Table -----");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    // -------------------------------
    // 2️⃣ Greatest Common Divisor
    // -------------------------------
    public static void findGCD() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n----- GCD Calculator -----");
        System.out.print("Enter first positive integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second positive integer: ");
        int n2 = input.nextInt();

        int gcd = 1;

        int min = Math.min(n1, n2);

        for (int k = 2; k <= min; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);
    }

    // -------------------------------
    // 3️⃣ Tuition Growth Prediction
    // -------------------------------
    public static void predictTuition() {

        System.out.println("\n----- Tuition Growth -----");

        double tuition = 10000;
        int years = 0;

        while (tuition < 20000) {
            tuition *= 1.07;
            years++;
        }

        System.out.println("Tuition will double in " + years + " years.");
        System.out.printf("Tuition after %d years: $%.2f%n", years, tuition);
    }
}