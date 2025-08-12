package main.chapter9.quiz;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");

        int rows = input.nextInt();
        int columns = input.nextInt();

        System.out.println("Enter the array: ");
        double[][] locations = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                locations[i][j] = input.nextDouble();
            }
        }

        Location location = Location.locateLargerst(locations);

        System.out.printf(
                "The location of the largest element %.2f is at (%d, %d)",
                location.maxValue, location.row, location.column
        );
    }
}
