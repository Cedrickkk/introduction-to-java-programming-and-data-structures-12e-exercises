package main.chapter6.quiz;

public class PentagonalNumbers {
    public static void main(String[] args) {
        printPentagonalNumbers(100);
    }

    public static int getPentagonalNumbers(int number) {
        return number * (3 * number - 1) / 2;
    }

    public static void printPentagonalNumbers(int numberOfPentagonalNumbers) {
        final int NUMBER_OF_PENTAGONAL_NUMBERS_PER_LINE = 10;
        int i = 0;
        while (i <= numberOfPentagonalNumbers) {
            if (i % NUMBER_OF_PENTAGONAL_NUMBERS_PER_LINE != 0) {
                System.out.printf("%7d", getPentagonalNumbers(i));
            } else {
                System.out.println();
            }
            i++;
        }
    }
}
