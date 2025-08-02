package main.chapter5.quiz;

import java.util.Scanner;

public class MultiplicationQuizLoop {
    public static void main(String[] args) {
        int correctCount = 0;
        int count = 0;
        long startTime = System.nanoTime();
        Scanner input = new Scanner(System.in);
        String output = "";

        char continueLoop = 'Y';

        while (continueLoop == 'Y') {
            int n1 = (int) (Math.random() * 12) + 1;
            int n2 = (int) (Math.random() * 12) + 1;
            int product = n1 * n2;

            System.out.print("What is " + n1 + " * " + n2 + ": ");
            int answer = input.nextInt();

            if (answer == product) {
                System.out.println("You are correct.");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + n1 + " * " + n2 + " should be = " + product);
            }

            count++;
            output += "\n" + n1 + "-" + n2 + " = " + answer + (((n1 - n2 == answer)) ? " correct" : " wrong");

            System.out.print("Enter 'Y' to continue and 'N' to quit: ");
            continueLoop = input.next().charAt(0);
        }
        long endTime = System.nanoTime();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime + " seconds\n" + output);

    }
}
