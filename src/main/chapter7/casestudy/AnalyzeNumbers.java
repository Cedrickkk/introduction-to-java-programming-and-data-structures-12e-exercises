package main.chapter7.casestudy;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int numberOfItems = input.nextInt();

        double[] numbers = new double[numberOfItems];
        double sum = 0;
        int totalAboveAvg = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < numberOfItems; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / numberOfItems;

        for (int i = 0; i < numberOfItems; i++) {
            if (numbers[i] > average) {
                totalAboveAvg++;
            }
        }

        System.out.println("The average is " + average);
        System.out.println("Number of elements above the average is " + totalAboveAvg);
    }
}
