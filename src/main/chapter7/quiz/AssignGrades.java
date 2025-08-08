package main.chapter7.quiz;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.print("Enter the 4 scores: ");
        int[] scores = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }

        int highestScore = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
            }
        }

        int[] thresholds = {-5, -10, -15, -20};
        char[] grades = {'A', 'B', 'C', 'D'};
        for (int i = 0; i < scores.length; i++) {
            char finalGrade = 'F';
            for (int j = 0; j < thresholds.length; j++) {
                if (scores[i] >= highestScore + thresholds[j]) {
                    finalGrade = grades[j];
                    break;
                }
            }

            System.out.println(
                    "Student " + i + " score is " + scores[i] +
                            " and grade is " + finalGrade
            );
        }
    }
}
