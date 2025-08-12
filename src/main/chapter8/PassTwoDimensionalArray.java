package main.chapter8;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = getArray();
        System.out.println("The sum of all the element is " + sum(matrix));
    }

    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][4];
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
        }
        return sum;
    }
}
