package com.bankingconsoleapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];

        while (true) {

            System.out.println("=== MENU ===");
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Special action");
            System.out.println("5. Show account info");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Program exited.");
                break;
            }

            switch (choice) {

                case 1 -> {
                    System.out.print("Account number: ");

                    String accNum = scanner.nextLine();

                    System.out.print("Owner name: ");
                    String owner = scanner.nextLine();

                    System.out.print("Starting balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("1-Loan -  2-Deposit - 3-Mortgage");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    Account newAcc;

                    if (type == 1) {
                        newAcc = new LoanAccount(accNum, owner, balance);
                    } else if (type == 2) {
                        newAcc = new DepositAccount(accNum, owner, balance);
                    } else if (type == 3) {
                        newAcc = new MortgageAccount(accNum, owner, balance);
                    } else {
                        System.out.println("Invalid type");
                        break;
                    }

                    boolean saved = false;

                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            accounts[i] = newAcc;
                            saved = true;
                            System.out.println("Account created.");
                            break;
                        }
                    }

                    if (!saved) {
                        System.out.println("No space in array.");
                    }
                }

                case 2 -> {
                    System.out.print("Account number: ");
                    String num = scanner.nextLine();

                    Account acc = findAccount(accounts, num);

                    if (acc != null) {
                        System.out.print("Deposit amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();
                        acc.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                }

                case 3 -> {
                    System.out.print("Account number: ");
                    String num = scanner.nextLine();

                    Account acc = findAccount(accounts, num);

                    if (acc != null) {
                        System.out.print("Withdraw amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();
                        acc.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Account number: ");
                    String num = scanner.nextLine();
                    Account acc = findAccount(accounts, num);

                    if (acc != null) {

                        switch (acc) {
                            case LoanAccount loan -> loan.chargeInterest();
                            case DepositAccount dep -> dep.addMonthlyBonus();
                            case MortgageAccount mort -> mort.addMonthlyFee();
                            default -> {
                            }
                        }

                    } else {
                        System.out.println("Account not found.");
                    }
                }

                case 5 -> {
                    System.out.print("Account number: ");
                    String num = scanner.nextLine();

                    Account acc = findAccount(accounts, num);

                    if (acc != null) {
                        System.out.println("--- INFO ---");
                        System.out.println("Number: " + acc.getAccountNumber());
                        System.out.println("Owner: " + acc.getOwnerName());
                        System.out.println("Balance: " + acc.getBalance());
                        System.out.println("Type: " + acc.getClass().getSimpleName());
                    } else {
                        System.out.println("Account not found.");
                    }
                }

                default -> System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    public static Account findAccount(Account[] arr, String num) {

        for (Account a : arr) {
            if (a != null && a.getAccountNumber().equals(num)) {
                return a;
            }
        }

        return null;
    }
}
