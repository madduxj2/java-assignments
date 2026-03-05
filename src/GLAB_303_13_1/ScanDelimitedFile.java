package GLAB_303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimitedFile {

    public static void main(String[] args) {
        String location = "C:/Users/jacob.maddux/IdeaProjects/Assignments/cars.csv";

        ArrayList<Car> cars = new ArrayList<>();

        try (Scanner input = new Scanner(new File(location))) {

            // ✅ Skip header row (GLAB_303_13_1.Car,MPG,Cylinders,...)
            if (input.hasNextLine()) input.nextLine();

            while (input.hasNextLine()) {
                String line = input.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] row = line.split(",");

                // Safety check
                if (row.length < 9) continue;

                String name = row[0];
                double mpg = parseDoubleSafe(row[1]);
                int cylinders = parseIntSafe(row[2]);
                double displacement = parseDoubleSafe(row[3]);
                double horsepower = parseDoubleSafe(row[4]);
                double weight = parseDoubleSafe(row[5]);
                double acceleration = parseDoubleSafe(row[6]);
                int model = parseIntSafe(row[7]);
                String origin = row[8];

                cars.add(new Car(name, mpg, cylinders, displacement, horsepower, weight, acceleration, model, origin));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found! Check your path.");
            e.printStackTrace();
        }

        // Print results
        for (Car c : cars) {
            System.out.println(c);
        }

        System.out.println("Total cars loaded: " + cars.size());
    }

    private static double parseDoubleSafe(String s) {
        s = s.trim();
        if (s.equals("0") || s.isEmpty()) return 0.0;
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    private static int parseIntSafe(String s) {
        s = s.trim();
        if (s.equals("0") || s.isEmpty()) return 0;
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}