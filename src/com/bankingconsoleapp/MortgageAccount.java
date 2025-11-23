package com.bankingconsoleapp;

public class MortgageAccount extends Account {
    public MortgageAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }


    public void addMonthlyFee() {
        var newBalance = getBalance() - 10;
        setBalance(newBalance);

        if (newBalance < 0) {
            System.out.println("Warning: Balance is negative!");
        } else {
            System.out.println("Monthly fee applied. New balance: " + getBalance());
        }


    }


}
