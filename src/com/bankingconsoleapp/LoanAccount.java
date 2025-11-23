package com.bankingconsoleapp;

public class LoanAccount extends Account {

    public LoanAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }


    public void chargeInterest() {

        var interest = getBalance() * 0.05;
        setBalance(getBalance() + interest);
        System.out.println("Interest added! New balance: " + getBalance());

    }


}
