package main.chapter10.quiz;

import main.chapter9.quiz.Account;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = createAccounts();

        while (true) {
            System.out.print("\nEnter an Account ID to start: ");
            int id = input.nextInt();

            Account currentAccount = getAccount(id, accounts);

            if (currentAccount == null) {
                System.out.println("Error: Account with ID " + id + " does not exist. Please try again.");
                continue;
            }

            int choice = 0;
            while (choice != 4) {
                printMenu();
                System.out.print("Enter your choice: ");

                choice = input.nextInt();
                System.out.println("Invalid input. Please enter a number between 1 and 4.");

                switch (choice) {
                    case 1:
                        System.out.printf("Current Balance: $%.2f%n", currentAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: $");
                        double withdrawAmount = input.nextDouble();
                        currentAccount.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: $");
                        double depositAmount = input.nextDouble();
                        currentAccount.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.println("Logging out from Account ID " + currentAccount.getId() + ".");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        break;
                }
            }
        }
    }

    public static Account getAccount(int id, Account[] accounts) {
        if (id < 0 || id >= accounts.length) {
            return null;
        }
        return accounts[id];
    }

    public static void printMenu() {
        System.out.println("Main menu");
        System.out.println("1. check balance");
        System.out.println("2. withdraw");
        System.out.println("3. deposit");
        System.out.println("4. exit");
    }

    public static Account[] createAccounts() {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].setId(i);
            accounts[i].setBalance(100);
        }
        return accounts;
    }
}
