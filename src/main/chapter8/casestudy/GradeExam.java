package main.chapter8.casestudy;

public class GradeExam {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        displayStudentsCorrectCount(answers);
    }

    public static void displayStudentsCorrectCount(char[][] studentAnswerKeys) {
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int highestCount = 0;
        int indexOfStudentWithHighestCount = 0;
        for (int i = 0; i < studentAnswerKeys.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < studentAnswerKeys[i].length; j++) {
                if (studentAnswerKeys[i][j] == keys[j]) correctCount++;
                if (correctCount > highestCount) {
                    highestCount = correctCount;
                    indexOfStudentWithHighestCount = i;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + correctCount);
        }

        System.out.println(
                "Student with highest count is " +
                        indexOfStudentWithHighestCount +
                        " with a correct count of " + highestCount
        );
    }
}
