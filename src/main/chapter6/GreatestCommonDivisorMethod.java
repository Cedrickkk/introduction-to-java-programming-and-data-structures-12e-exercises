package main.chapter6;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInt = input.nextInt();

        System.out.print("Enter first integer: ");
        int secondInt = input.nextInt();

        System.out.println("The greatest common divisor for " + firstInt + " and " + secondInt + " is " + gcd(firstInt, secondInt));
    }

    private static int gcd(int firstInt, int secondInt) {
        int k = 2; // Possible gcd
        int gcd = 1; // Initial gcd

        while (k <= firstInt && k <= secondInt) {
            if (firstInt % k == 0 && secondInt % k == 0) {
                gcd = k;
            }
            k++;
        }
        return gcd;
    }
}
