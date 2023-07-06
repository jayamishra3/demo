package org.example.bank;

import java.time.LocalDate;
import java.util.List;
abstract class Account {
    private int accountNumber;
    private List<Transaction> transactions;
    private double balance;
    private LocalDate openingDate;

    public Account(int accountNumber, List<Transaction> transactions, double balance, LocalDate openingDate) {
        this.accountNumber = accountNumber;
        this.transactions = transactions;
        this.balance = balance;
        this.openingDate = openingDate;
    }

    public Account() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }
    public abstract void deposit(double amount);
    public abstract String getAccountDetails();
}

