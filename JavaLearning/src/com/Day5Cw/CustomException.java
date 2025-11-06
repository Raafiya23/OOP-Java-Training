package com.Day5Cw;

class InsufficientFundException extends Exception{
    public InsufficientFundException(String message){
        super(message);
    }
}

class BankAcc{
    int balance;
    public BankAcc(int initialBalance){
        this.balance=initialBalance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount) throws InsufficientFundException{
        if(balance<amount){
            throw new InsufficientFundException("Insufficient Balance");
        }
        balance-=amount;
    }
    public void getBalance(){
        System.out.println(balance);
    }
}

public class CustomException {
    public static void main(String[] args) {
        BankAcc acc=new BankAcc(5000);
        acc.deposit(8000);
        acc.getBalance();
        try {
            acc.withdraw(15000);
        } catch (InsufficientFundException e) {
            System.out.println("InsufficientFundsException: "+e.getMessage());
        }
    }
}
