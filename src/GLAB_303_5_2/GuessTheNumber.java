package GLAB_303_5_2;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playAgain;

        do {
            int number = (int) (Math.random() * 101);
            int guess = -1;

            System.out.println("Guess a magic number between 0 and 100");

            while (guess != number) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();

                if (guess == number) {
                    System.out.println("Yes, the number is " + number);
                } else if (guess > number) {
                    System.out.println("Your guess is too high");
                } else {
                    System.out.println("Your guess is too low");
                }
            }

            System.out.print("Would you like to play again? (yes/no): ");
            input.nextLine(); // clear buffer
            playAgain = input.nextLine();

        } while (playAgain.equalsIgnoreCase("yes"));

        input.close();
    }
}
