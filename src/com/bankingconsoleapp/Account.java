package com.bankingconsoleapp;

public class Account {

    private String accountNumber;

    private String ownerName;

    private double balance;


    public Account(String accountNumber, String ownerName, double balance) {
        setAccountNumber(accountNumber);
        setOwnerName(ownerName);
        setBalance(balance);


    }

    // empty constructor
    public Account() {
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty");
            return;

        } else if (accountNumber.length() < 4) {
            System.out.println("Error: Account number must be at least 4 characters");
            return;
        }


        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isEmpty()) {
            System.out.println("Error: Owner name cannot be null or empty");
            return;

        } else if (ownerName.length() < 3) {
            System.out.println("Error: Owner name must be at least 3 characters");
            return;
        }
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            return;
        }
        this.balance = balance;
    }


    public String getAccountNumber() {
        if (accountNumber == null || accountNumber.isEmpty()) {
            return "No account number";
        }
        return accountNumber;
    }

    public String getOwnerName() {
        if (ownerName == null || ownerName.isEmpty()) {
            return "Unknown";
        }
        return ownerName;
    }

    public double getBalance() {
        if (balance < 0) {
            return 0;

        }
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance");
        } else if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance -= amount;
            System.out.println("Withdraw successful! New balance: " + balance);
        }
    }


}
