package GLAB_303_3_2;

import java.util.Scanner;

public class ReadingCharacterFromConsole {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");

        String s = input.nextLine();

        char ch = s.charAt(0);

        System.out.println("The character entered is " + ch);

        input.close();
    }
}