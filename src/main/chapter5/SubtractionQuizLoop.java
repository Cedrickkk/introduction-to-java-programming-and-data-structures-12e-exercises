package main.chapter5;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.nanoTime();
        String output = "";
        Scanner input = new Scanner(System.in);
        char continuLoop = 'Y';

        while (continuLoop == 'Y') {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.print("What is " + number1 + " - " + number2 + ": ");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct.");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + number1 + "-" + number2 + " should be = " + (number1 - number2));
            }

            count++;
            output += "\n" + number1 + "-" + number2 + " = " + answer + (((number1 - number2 == answer)) ? " correct" : " wrong");

            System.out.print("Enter Y to continue and N to quit: ");
            continuLoop = input.next().charAt(0);
        }

        long endTime = System.nanoTime();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime + " seconds\n" + output);

    }
}
