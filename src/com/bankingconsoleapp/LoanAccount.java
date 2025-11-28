package com.bankingconsoleapp;

public class LoanAccount extends Account {

    public LoanAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }


    public void chargeInterest() {

        var interest = getBalance() * 1.05;
        setBalance(interest);

    }


}
