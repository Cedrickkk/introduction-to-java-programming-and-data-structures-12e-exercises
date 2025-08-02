package main.chapter5;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 10) + 1;
        int guess = -1;
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("Yes the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
        }

    }
}
