package com.Day5Cw;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String holder, double initialBalance) {
        accountHolder = holder;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Withdrawal amount exceeds balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Dhikshi", 5000);

        System.out.println("---- Initial Account Details ----");
        account.displayBalance();

        System.out.println("\n---- Deposit ----");
        account.deposit(2000);

        System.out.println("\n---- Successful Withdrawal ----");
        try {
            account.withdraw(3000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n---- Failed Withdrawal ----");
        try {
            account.withdraw(6000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n---- Final Balance ----");
        account.displayBalance();
    }
}
