package main.chapter6.quiz;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("The number "
                + ((isPalindrome(number) ? "is " : " is not ")
                + " a palindrome")
        );
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = reverse(number);
        return reversedNumber == number;
    }
}
