package com.company;

import static org.junit.Assert.*;

public class BankTest {

    @org.junit.Test
    public void withdraw() {
        fail("this test is not implemented yet");
    }

    @org.junit.Test
    public void deposit() {
        Bank newBank=new Bank(1000);
        newBank.deposit(200);
        int newBal= newBank.getBalance();
        assertEquals(1200,newBal,0); //delta is error tolerance

    }

    @org.junit.Test
    public void getBalance() {
        fail("this test is not implemented yet");
    }

}



