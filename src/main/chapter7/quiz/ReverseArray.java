package main.chapter7.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        reverse(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }
}
