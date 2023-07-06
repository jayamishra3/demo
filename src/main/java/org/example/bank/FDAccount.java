package org.example.bank;
import java.time.LocalDate;
import java.util.List;
import org.example.exception.InsufficientBalanceException;
class FDAccount extends Account{
private LocalDate maturityDate;
private double interestRate;

public FDAccount(int accountNumber, List<Transaction> transactions, double balance, LocalDate openingDate, LocalDate maturityDate, double interestRate) {
        super(accountNumber, transactions, balance, openingDate);
        this.maturityDate = maturityDate;
        this.interestRate = interestRate;
        }

public FDAccount() {
        }

public LocalDate getMaturityDate() {
        return maturityDate;
        }

public double getInterestRate() {
        return interestRate;
        }

public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
        }

public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        }
        /*Create class InsufficientBalanceException*/
public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>getBalance()){
        throw new InsufficientBalanceException("Insufficient Balance");
        }
        else{
        setBalance(getBalance()-amount);
        getTransactions().add(new Transaction.Builder().setAmount(amount).setDate(LocalDate.now()).setType(Transaction.Type.DEBIT).build());
        }
        }
public String getAccountDetails(){
        return "Account Number: "+getAccountNumber()+"\nBalance: "+getBalance()+"\nOpening Date: "+getOpeningDate()+"\nMaturity Date: "+getMaturityDate()+"\nInterest Rate: "+getInterestRate();
        }
public void deposit(double amount){
        setBalance(getBalance()+amount);
        getTransactions().add(new Transaction.Builder().setAmount(amount).setDate(LocalDate.now()).setType(Transaction.Type.CREDIT).build());
        }

public int getTenure(){
        return getOpeningDate().until(getMaturityDate()).getMonths();
        }
public double getMaturityAmount(){
        return getBalance()+getBalance()*getInterestRate()*getTenure()/100;
        }
        }
