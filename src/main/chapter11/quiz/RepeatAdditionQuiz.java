package main.chapter11.quiz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<>();

        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();


        while (number1 + number2 != answer) {
            if (!answers.contains(answer)) {
                answers.add(answer);
            } else {
                System.out.println("You already entered " + answer);
            }
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }

        System.out.println("You got it!");
    }
}
