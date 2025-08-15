package main.chapter10.casestudy;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphaNumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.println(
                "Ignoring non-alphanumeric characters, \nis "
                        + str + " a palindrome? " + isPalindrome(str)
        );
    }

    public static boolean isPalindrome(String str) {
        String filtered = filter(str);
        String reversed = reverse(filtered);
        return reversed.equals(filtered);
    }

    public static String filter(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
