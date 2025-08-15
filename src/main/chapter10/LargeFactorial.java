package main.chapter10;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        BigInteger result = factorial(n);
        System.out.println(n + "! is \n" + result);
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
