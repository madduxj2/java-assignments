package PA_303_7_1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    // Task 1
    private static void task1() {
        System.out.println("\n--- Task 1 ---");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

    // Task 2
    private static void task2() {
        System.out.println("\n--- Task 2 ---");
        int[] arr = {13, 5, 7, 68, 2};
        int middle = arr[arr.length / 2];
        System.out.println(middle); // should print 7
    }

    // Task 3
    private static void task3() {
        System.out.println("\n--- Task 3 ---");
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Array length: " + colors.length);

        String[] copy = colors.clone();
        System.out.println("Cloned array: " + Arrays.toString(copy));
    }

    // Task 4
    private static void task4() {
        System.out.println("\n--- Task 4 ---");
        int[] nums = {10, 20, 30, 40, 50};

        System.out.println("First element: " + nums[0]);
        System.out.println("Last element: " + nums[nums.length - 1]);

        try {
            System.out.println(nums[nums.length]); // out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception when accessing nums[nums.length]: " + e);
        }

        try {
            nums[5] = 999; // out of bounds (valid indices are 0-4)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception when assigning nums[5]: " + e);
        }
    }

    // Task 5
    private static void task5() {
        System.out.println("\n--- Task 5 ---");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));
    }

    // Task 6
    private static void task6() {
        System.out.println("\n--- Task 6 ---");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    // Task 7
    private static void task7() {
        System.out.println("\n--- Task 7 ---");
        int[] arr = {11, 22, 33, 44, 55}; // 5 elements, middle index is 2

        for (int i = 0; i < arr.length; i++) {
            if (i == 2) continue;
            System.out.println(arr[i]);
        }
    }

    // Task 8
    private static void task8() {
        System.out.println("\n--- Task 8 ---");
        String[] arr = {"one", "two", "three", "four", "five"};
        System.out.println("Before swap: " + Arrays.toString(arr));

        int middleIndex = arr.length / 2; // 2
        String temp = arr[0];
        arr[0] = arr[middleIndex];
        arr[middleIndex] = temp;

        System.out.println("After swap:  " + Arrays.toString(arr));
    }

    // Task 9
    private static void task9() {
        System.out.println("\n--- Task 9 ---");
        int[] arr = {4, 2, 9, 13, 1, 0};

        Arrays.sort(arr);

        System.out.println("Array in ascending order: " + Arrays.toString(arr));
        System.out.println("The smallest number is " + arr[0]);
        System.out.println("The biggest number is " + arr[arr.length - 1]);
    }

    // Task 10
    private static void task10() {
        System.out.println("\n--- Task 10 ---");
        Object[] arr = {7, "hello", "world", "java", 3.14};

        System.out.println(Arrays.toString(arr));
    }

    // Task 11
    private static void task11() {
        System.out.println("\n--- Task 11 ---");
        Scanner scan = new Scanner(System.in);

        System.out.print("How many favorite things do you have? ");
        int count = scan.nextInt();
        scan.nextLine(); // consume leftover newline

        String[] favorites = new String[count];

        for (int i = 0; i < favorites.length; i++) {
            System.out.print("Enter your thing: ");
            favorites[i] = scan.nextLine();
        }

        System.out.println("Your favorite things are:");
        for (String item : favorites) {
            System.out.print(item + " ");
        }
        System.out.println();
        // Don't close scan here if you're running other scanner code elsewhere
    }
}