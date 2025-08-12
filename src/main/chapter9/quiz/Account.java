package main.chapter9.quiz;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private final Date dateCreated = new Date();

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
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
            printWithdrawReceipt(amount);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            printDepositReceipt(amount);
        }
    }

    public void printWithdrawReceipt(double amount) {
        System.out.println("-----------------------------------------");
        System.out.println("\t\t\tWITHDRAWAL RECEIPT");
        System.out.println("-----------------------------------------");
        System.out.printf(" Account ID: %27d%n", id);
        System.out.printf(" Withdrawn Amount: %21s%n", String.format("$%,.2f", amount));
        System.out.printf(" Withdrawn Amount: %21s%n", String.format("$%,.2f", balance));
        System.out.printf(" Monthly Interest Rate: %16f%n", this.getMonthlyInterestRate());
        System.out.printf(" Annual Interest Rate: %17f%n", annualInterestRate);
        System.out.println("------------nothing follows--------------\n");
    }

    public void printDepositReceipt(double amount) {
        System.out.println("-----------------------------------------");
        System.out.println("\t\t\tDEPOSIT RECEIPT");
        System.out.println("-----------------------------------------");
        System.out.printf(" Account ID: %27d%n", id);
        System.out.printf(" Withdrawn Amount: %21s%n", String.format("$%,.2f", amount));
        System.out.printf(" Withdrawn Amount: %21s%n", String.format("$%,.2f", balance));
        System.out.printf(" Monthly Interest Rate: %16f%n", this.getMonthlyInterestRate());
        System.out.printf(" Annual Interest Rate: %17f%n", annualInterestRate);
        System.out.println("------------nothing follows--------------\n");
    }
}
