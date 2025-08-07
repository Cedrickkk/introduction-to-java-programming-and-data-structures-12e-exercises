package main.chapter7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

    }

    public static int[] initializeArrayFromUserInput(Scanner input, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static int[] initializeArrayWithRandomValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int maximumElementFromArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minimumIndexOfMaximumElementFromArray(int[] array) {
        int max = array[0];
        int minimumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }

    public static int[] shuffleArray(int[] array) {
        int j = (int) (Math.random() * array.length);
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void shiftingElementsFromArray(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temp;
    }

    public static void displayMonthName(Scanner input) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"
        };
        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
    }
}
