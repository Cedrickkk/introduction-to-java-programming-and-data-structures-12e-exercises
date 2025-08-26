package main.chapter13.quiz;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of triangle separated by space: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        System.out.print("Should the triangle be filled (Y: Yes, N: No): ");
        char isFilledChar = input.next().charAt(0);

        boolean isFilled = isFilledChar == 'Y';

        Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);

        System.out.println(triangle);
    }
}
