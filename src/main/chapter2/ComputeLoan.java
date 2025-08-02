package main.chapter2;


import java.util.Scanner;

/**
 * <h6>Software Development Process</h1>
 *
 * <p><strong>Requirements:</strong></p>
 * <ul>
 *     <li>Let the user enter the interest rate, loan amount and num. of years for which payment will be made</li>
 *    <li> Must display the monthly payment and total payment amounts</li>
 * </ul>
 *
 * <p><strong>System Analysis:</strong></p>
 * <ul>
 *     <li>Output is the monthly payment and total payment</li>
 * </ul>
 *
 * <p><strong>System Design:</strong></p>
 * <ul>
 *     <li>Prompt the user to enter annual interest rate, num. of years and the loan amount</li>
 *     <li>Convert the given input of annual interest rate in decimal</li>
 *     <li>Get the monthly interest rate by dividing the annual interest in 12 (months)</li>
 *     <li>Compute the monthly payment using the preceding formula</li>
 *     <li>Compute the total payment multiplied by 12 and number of years</li>
 *     <li>Display the monthly payment and total payment</li>
 * </ul>
 */

public class ComputeLoan {
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Enter the annual interest rate
        System.out.print("Enter annual interest rate, (e.g., 7.25): ");
        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 12) / 100;

        // Enter the number of years
        System.out.print("Enter number of years, (e.g., 5): ");
        int numOfYears = input.nextInt();

        // Enter the loan amount
        System.out.print("Enter loan amount, (e.g., 120000.95): ");
        double loanAmount = input.nextDouble();

        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12));
        double totalPayment = monthlyPayment * numOfYears * 12;


        System.out.printf("The monthly payment is $%.2f%n", monthlyPayment);
        System.out.printf("The total payment is $%.2f%n", totalPayment);
    }
}
