package main.chapter10;

import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 12000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("\nThe loan was created on %s\n" +
                        "The monthly payment is %s\n" +
                        "The total payment is %s\n",
                loan.getLoanDate().toString(),
                String.format("$%.2f", loan.getMonthlyPayment()),
                String.format("$%.2f", loan.getTotalPayment()));
    }
}
