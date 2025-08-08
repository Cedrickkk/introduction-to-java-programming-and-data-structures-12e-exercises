package main.chapter7.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class CountOddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];
        int oddCounter = 0;
        int evenCounter = 0;

        int counter = 0;

        int number;

        while ((number = input.nextInt()) != 0) {
            if (counter > numbers.length) break;
            numbers[counter] = number;
            counter++;
        }

        Arrays.sort(numbers, 0, counter);

        for (int i = 0; i < counter; i++) {
            if (numbers[i] % 2 == 0) evenCounter++;
            else oddCounter++;
        }

        System.out.println("The number of odd numbers: " + oddCounter);
        System.out.println("The number of even numbers: " + evenCounter);
    }
}
