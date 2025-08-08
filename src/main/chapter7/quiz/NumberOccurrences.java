package main.chapter7.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[50];
        int counter = 0;
        int number;

        while ((number = input.nextInt()) != 0) {
            if (counter > numbers.length) break;
            numbers[counter] = number;
            counter++;
        }

        Arrays.sort(numbers, 0, counter);

        for (int i = 0; i < counter; i++) {
            int currentElement = numbers[i];
            int currentElementCount = 1;
            while (i + 1 < counter && numbers[i + 1] == currentElement) {
                currentElementCount++;
                i++;
            }
            String occurrenceWord = (currentElementCount > 1) ? "times" : "time";
            System.out.println(currentElement + " occurs " + currentElementCount + " " + occurrenceWord);
        }
    }

    private static void initialSolution() {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[50];
        int[] counts = new int[50];

        int number = input.nextInt();
        int counter = 0;

        while (number != 0) {
            if (counter > numbers.length) break;

            numbers[counter] = number;
            counter++;
            number = input.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        for (int i = 0; i < numbers.length && numbers[i] != 0; i++) {
            int currentElement = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (currentElement == numbers[j]) {
                    counts[j]++;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < counts.length; i++) {
            String occurrenceWord = "time";
            if (counts[i] > 1) occurrenceWord = "times";
            if (counts[i] == 0) continue;
            System.out.println(
                    numbers[i] + " occurs " + counts[i] + " " + occurrenceWord
            );
        }

    }
}
