package PA_303_4_1;
import java.util.Scanner;

public class ControlFlowPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        part1();
        part2();
        part3();
        part4();

        part5(scan);
        part6(scan);
        part7(scan);

        scan.close();
    }

    // 1) if statement
    private static void part1() {
        System.out.println("\n--- Part 1 ---");
        int x = 7;

        if (x < 10) {
            System.out.println("Less than 10");
        }

        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        // Should print nothing for x = 15
    }

    // 2) if-else statement
    private static void part2() {
        System.out.println("\n--- Part 2 ---");
        int x = 7;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10) {
            System.out.println("Greater than 10");
        } else {
            // exactly 10
            System.out.println("Equal to 10");
        }

        x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10) {
            System.out.println("Greater than 10");
        } else {
            System.out.println("Equal to 10");
        }
    }

    // 3) if-else-if chain
    private static void part3() {
        System.out.println("\n--- Part 3 ---");
        int x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }

        x = 50;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
    }

    // 4) range check (10..20 inclusive)
    private static void part4() {
        System.out.println("\n--- Part 4 ---");
        int x = 15;

        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }

        x = 5;

        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
    }

    // 5) grade calculator using Scanner
    private static void part5(Scanner scan) {
        System.out.println("\n--- Part 5 (Grades) ---");
        System.out.print("Enter a score (0-100): ");
        int score = scan.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    // 6) weekday using switch
    private static void part6(Scanner scan) {
        System.out.println("\n--- Part 6 (Weekday Switch) ---");
        System.out.print("Enter a number (1-7): ");
        int day = scan.nextInt();

        if (day < 1 || day > 7) {
            System.out.println("Out of range");
            return;
        }

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    // 7) tax calculator (2009 brackets)
    private static void part7(Scanner scan) {
        System.out.println("\n--- Part 7 (Tax Calculator - 2009) ---");
        System.out.println("Filing Status:");
        System.out.println("1 = Single");
        System.out.println("2 = Married Filing Jointly / Qualifying Widow(er)");
        System.out.println("3 = Married Filing Separately");
        System.out.println("4 = Head of Household");

        System.out.print("Enter filing status (1-4): ");
        int status = scan.nextInt();

        System.out.print("Enter taxable income: ");
        double income = scan.nextDouble();

        if (income < 0) {
            System.out.println("Income cannot be negative.");
            return;
        }

        double tax = calculateTax2009(status, income);

        if (tax < 0) {
            System.out.println("Out of range (invalid filing status).");
        } else {
            System.out.printf("Tax owed: $%.2f%n", tax);
        }
    }

    // Progressive tax calculator for 2009 brackets shown in your prompt image
    private static double calculateTax2009(int status, double income) {
        // Each status has bracket "tops" and matching rates.
        // We compute progressive tax across brackets.
        double[] tops;
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        switch (status) {
            case 1: // Single
                tops = new double[]{8350, 33950, 82250, 171550, 372950, Double.POSITIVE_INFINITY};
                break;
            case 2: // Married Filing Jointly / Qualifying Widow(er)
                tops = new double[]{16700, 67900, 137050, 208850, 372950, Double.POSITIVE_INFINITY};
                break;
            case 3: // Married Filing Separately
                tops = new double[]{8350, 33950, 68525, 104425, 186475, Double.POSITIVE_INFINITY};
                break;
            case 4: // Head of Household
                tops = new double[]{11950, 45500, 117450, 190200, 372950, Double.POSITIVE_INFINITY};
                break;
            default:
                return -1; // invalid status
        }

        double tax = 0.0;
        double prevTop = 0.0;

        for (int i = 0; i < tops.length; i++) {
            double top = tops[i];

            if (income <= prevTop) break;

            double taxableInBracket = Math.min(income, top) - prevTop;
            tax += taxableInBracket * rates[i];

            prevTop = top;
        }

        return tax;
    }
}
