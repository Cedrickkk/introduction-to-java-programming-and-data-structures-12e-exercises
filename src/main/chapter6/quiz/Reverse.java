package main.chapter6.quiz;


public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(12345));
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
}
