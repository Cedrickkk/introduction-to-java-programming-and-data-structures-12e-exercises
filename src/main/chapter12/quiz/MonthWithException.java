package main.chapter12.quiz;

import java.util.Scanner;

public class MonthWithException {
    public static void main(String[] args) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"
        };

        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number between 1-12: ");
            int number = input.nextInt();
            System.out.println("The month is: " + months[number - 1]);
            System.out.println("The days of month is: " + daysOfMonth[number - 1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wrong input. Numbers must be between 1-12 only.");
        }
    }
}
