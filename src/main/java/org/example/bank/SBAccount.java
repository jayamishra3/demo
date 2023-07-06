package org.example.bank;

import java.time.LocalDate;
import java.util.List;
import org.example.exception.InsufficientBalanceException;
class SBAccount extends Account {
    private double minBalance;

    public SBAccount(int accountNumber, List<Transaction> transactions, double balance, LocalDate openingDate, double minBalance) {
        super(accountNumber, transactions, balance, openingDate);
        this.minBalance = minBalance;
    }

    public SBAccount() {
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > getBalance()) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            setBalance(getBalance() - amount);
            getTransactions().add(new Transaction.Builder().setAmount(amount).setDate(LocalDate.now()).setType(Transaction.Type.DEBIT).build());
        }
    }

    public String getAccountDetails() {
        return "Account Number: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nOpening Date: " + getOpeningDate() + "\nMinimum Balance: " + getMinBalance();
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        getTransactions().add(new Transaction.Builder().setAmount(amount).setDate(LocalDate.now()).setType(Transaction.Type.CREDIT).build());
    }
}
