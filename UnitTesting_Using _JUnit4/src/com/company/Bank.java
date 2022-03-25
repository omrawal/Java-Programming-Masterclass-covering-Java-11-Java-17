package com.company;

public class Bank {
    private int balance;
    public Bank(int balance) {
        this.balance = balance;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public int getBalance(){
        return balance;
    }
}
