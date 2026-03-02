package GLAB_303_5_2;

import java.util.Scanner;

public class SubtractionQuizLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playAgain;

        do {
            final int NUMBER_OF_QUESTIONS = 5;
            int correctCount = 0;
            int count = 0;

            while (count < NUMBER_OF_QUESTIONS) {

                int number1 = (int) (Math.random() * 10);
                int number2 = (int) (Math.random() * 10);

                if (number1 < number2) {
                    int temp = number1;
                    number1 = number2;
                    number2 = temp;
                }

                System.out.print("What is " + number1 + " - " + number2 + "? ");
                int answer = input.nextInt();

                if (number1 - number2 == answer) {
                    System.out.println("You are correct!");
                    correctCount++;
                } else {
                    System.out.println("Wrong. Correct answer is " + (number1 - number2));
                }

                count++;
            }

            System.out.println("You got " + correctCount + " out of " + NUMBER_OF_QUESTIONS + " correct.");

            System.out.print("Would you like to play again? (yes/no): ");
            input.nextLine(); // clear buffer
            playAgain = input.nextLine();

        } while (playAgain.equalsIgnoreCase("yes"));

        input.close();
    }
}