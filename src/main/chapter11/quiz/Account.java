package main.chapter11.quiz;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id = 0;
    private String name;
    private double balance = 0.0;
    private Date dateCreated;
    private double annualInterestRate = 0.0;
    private ArrayList<Transaction> transactions;

    public static final char WITHDRAW = 'W';
    public static final char DEPOSIT = 'D';

    public Account() {
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / (12 * 100);
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            this.balance -= amount;
            transactions.add(new Transaction(
                    amount, Account.WITHDRAW, balance,
                    String.format("User withdraws %s on %s",
                            String.format("$%.2f", amount), new Date()
                    )
            ));
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            transactions.add(new Transaction(
                    amount, Account.DEPOSIT, balance,
                    String.format("User deposits %s on %s",
                            String.format("$%.2f", amount), new Date()
                    )
            ));
        }
    }

    public void printSummary() {
        System.out.println("\n| ------------------------------------------------------ |");
        System.out.println("| \t\t\t\t\tAccount Summary \t\t\t\t\t |");
        System.out.println("| ------------------------------------------------------ |");
        System.out.printf("| Account ID: %44s\n", String.format("%s |", getId()));
        System.out.printf("| Account Holder Name: %35s\n", String.format("%s |", getName()));
        System.out.printf("| Balance: %47s\n", String.format("$%.2f |", getBalance()));
        System.out.printf("| Annual Interest Rate: %34s\n", String.format("%f%% |", getAnnualInterestRate()));
        System.out.printf("| Monthly Interest Rate: %33s\n", String.format("%f%% |", getMonthlyInterestRate()));
        System.out.println("| Transactions: \t\t\t\t\t\t\t\t\t\t |");
        for (Transaction transaction : getTransactions()) {
            System.out.printf("|  %53s\n", String.format("%s\t |", transaction.getDescription()));
        }
        System.out.println("| -----------------nothing follows---------------------- |");
    }
}
