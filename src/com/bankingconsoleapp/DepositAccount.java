package com.bankingconsoleapp;

public class DepositAccount extends Account {

    public DepositAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }


    public void addMonthlyBonus() {
        var bonus = getBalance() * 0.01;
        setBalance(getBalance() +bonus);
        System.out.println("Monthly bonus added! New balance: " + getBalance());
    }


}
