package main.chapter5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int low = 0;
        int high = str.length() - 1;

        boolean isPalindrome = true;

        while (low <= high) {
            if (str.charAt(low) != str.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
