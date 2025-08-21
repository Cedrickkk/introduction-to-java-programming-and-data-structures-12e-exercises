package main.chapter12;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
            int quotient = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Exception: an integer cannot be divided by zero.");
        }
        System.out.println("Execution continues ...");
    }

    public static int quotient(int n1, int n2) {
        if (n2 == 0) throw new ArithmeticException("Divisor cannot be zero");
        return n1 / n2;
    }
}
