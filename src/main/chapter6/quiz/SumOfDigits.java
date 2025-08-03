package main.chapter6.quiz;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = input.nextLong();

        System.out.println("The sum of all the digits from " + n + " is " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += (int) n % 10;
            n = n / 10;
        }
        return sum;
    }
}
