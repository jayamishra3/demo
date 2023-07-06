
package org.example.bank;

import java.time.LocalDate;

public class Transaction {
    private double amount;
    private LocalDate date;
    private Type type;

    public enum Type {
        CREDIT,
        DEBIT
    }

    public Transaction(double amount, LocalDate date, Type type) {
        this.amount = amount;
        this.date = date;
        this.type = type;
    }

    public Transaction() {
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public Type getType() {
        return type;
    }

    public static class Builder {
        private double amount;
        private LocalDate date;
        private Type type;

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public Transaction build() {
            return new Transaction(amount, date, type);
        }
    }
}







