package main.chapter11.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int m = input.nextInt();

        ArrayList<Integer> factors = getFactors(m);
        int n = getSmallestPerfectSquareMultiplier(factors);

        System.out.printf(
                "The smallest n for m * n to be perfect square is %d \nm * n is %d",
                n, (n * m)
        );
    }

    public static int getSmallestPerfectSquareMultiplier(ArrayList<Integer> factors) {
        int n = 1, i = 0;
        while (i < factors.size()) {
            int currentFactor = factors.get(i);
            int currentFactorCount = countOccurrence(factors, i);
            if (currentFactorCount % 2 != 0) {
                n *= currentFactor;
            }
            i += currentFactorCount;
        }
        return n;
    }

    public static int countOccurrence(ArrayList<Integer> factors, int startIndex) {
        int currentFactor = factors.get(startIndex);
        int count = 0, j = startIndex;
        while (j < factors.size() && factors.get(j) == currentFactor) {
            count++;
            j++;
        }
        return count;
    }

    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                number = number / factor;
                factors.add(factor);
            } else {
                factor++;
            }
        }
        Collections.sort(factors);
        return factors;
    }
}
