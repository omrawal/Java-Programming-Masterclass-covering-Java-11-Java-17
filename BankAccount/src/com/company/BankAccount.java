package com.company;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int deposit(int amount){
        int init_bal=getBalance();
        int final_bal=init_bal+amount;
        setBalance(final_bal);
        return final_bal;
    }
    public int withdraw(int amount){
        int init_bal=getBalance();
        int final_bal;
        if(amount<init_bal){
            return -1;
        }
        else {
            final_bal=init_bal-amount;
            setBalance(final_bal);
            return final_bal;
        }
    }
}
