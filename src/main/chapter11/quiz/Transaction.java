package main.chapter11.quiz;

import java.util.Date;

public class Transaction {
    private Date date;
    private double amount;
    private char type;
    private double balance;
    private String description;

    public Transaction(double amount, char type, double balance, String description) {
        this.date = new Date();
        this.amount = amount;
        this.type = type;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public char getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "{" +
                "date=" + date +
                ", amount=" + amount +
                ", type=" + type +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
