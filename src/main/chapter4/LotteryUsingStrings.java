package main.chapter4;

import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        System.out.println(lottery);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        if (guess.equals(lottery)) {
            System.out.println("Exact match: You win $10,000.00");
        } else if (guessDigit2 == lotteryDigit2 && guessDigit1 == lotteryDigit2) {
            System.out.println("Math all digits: You win $3,000.00");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: You win $1,000.00");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
