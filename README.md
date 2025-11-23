🚀 Banking Console Application

This is a Java console-based banking system that demonstrates key OOP principles such as Encapsulation, Inheritance, Polymorphism, and Validation.
The project includes multiple account types and allows users to perform basic banking operations from the terminal.

📌 Features

Create different types of accounts:

DepositAccount

LoanAccount

MortgageAccount

Deposit & Withdraw money

Account-specific special actions:

DepositAccount → Monthly 1% bonus

LoanAccount → Monthly interest

MortgageAccount → Monthly fee deduction

Display account information

Menu-based console interaction

Input validations for all fields

Uses Arrays to store accounts

Follows clean and extensible OOP structure

🧱 Project Structure
BankingConsoleApp/
│
├── Account.java
├── DepositAccount.java
├── LoanAccount.java
├── MortgageAccount.java
└── Main.java

🧠 OOP Concepts Used
✔ Encapsulation

All fields (accountNumber, ownerName, balance) are private and accessible only through validated setters/getters.

✔ Inheritance

DepositAccount, LoanAccount, MortgageAccount all extend the base Account class.

✔ Polymorphism

Special actions are executed depending on the runtime account type.

✔ Validation

Each setter prevents invalid inputs:

Empty names

Invalid account numbers

Negative balance

Illegal deposit/withdraw amounts

🖥️ How to Run

Open terminal inside the project folder and type:

javac *.java
java Main

📌 Example Console Menu
1. Create account
2. Deposit
3. Withdraw
4. Run special action
5. Show account info
0. Exit

📝 Sample Output
Enter account number: 1234
Enter owner name: Farid
Enter initial balance: 200
Select type: 1-Deposit, 2-Loan, 3-Mortgage
Account created successfully!

Deposit amount: 100
Deposit successful! New balance: 300.0

🛠 Technologies Used

Java 17+

IntelliJ IDEA / Terminal

Git & GitHub



Feel free to clone, improve, or extend this project.

git clone https://github.com/faridkharimli05/BankAccountSystem.git
