package main.chapter8;

import java.util.Scanner;

public class TwoDimensionalArrayCommonOperations {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
    }

    public static void initializeWithInputValues() {
        int[][] matrix = new int[10][10];
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
    }

    public static void initializeWithRandomValues() {
        int[][] matrix = new int[10][10];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100) + 1;
            }
        }
    }

    public static int getSumOfAllElements(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
        }
        return sum;
    }

    public static int getRowWithLargestSum(int[][] matrix) {
        int maximumRow = 0;
        int indexOfMaximumRow = 0;

        for (int row = 0; row < matrix.length; row++) {
            int sumOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sumOfThisRow += matrix[row][column];
            }
            if (sumOfThisRow > maximumRow) {
                maximumRow = sumOfThisRow;
                indexOfMaximumRow = row;
            }
        }
        return indexOfMaximumRow;
    }

    public static void printTwoDimensionalArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        //  for(int row = 0; row < matrix.length; row++) {
        //      System.out.println(Arrays.toString(matrix[row]));
        //  }
    }

    public static void printSumOfAllElementsByColumn(int[][] matrix) {
        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][column];
            }
            System.out.println(
                    "Sum for column " + column + " is " + total
            );
        }
    }

    public static void printSumOfAllElementsByRow(int[][] matrix) {
        int rowSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
                rowSum += matrix[row][column];
            }
            System.out.println("The sum of row " + row + " is: " + rowSum);
            rowSum = 0;
        }
    }

    public static void shuffle(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                int randomRowIndex = (int) (Math.random() * matrix.length);
                int randomColumnIndex = (int) (Math.random() * matrix[row].length);
                int temp = matrix[row][column];
                matrix[row][column] = matrix[randomRowIndex][randomColumnIndex];
                matrix[randomRowIndex][randomColumnIndex] = temp;
            }
        }
    }
}
