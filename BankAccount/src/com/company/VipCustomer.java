package com.company;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public VipCustomer(){
        this("defaultName",99999,"defaultMail@demomail.com");
    }
    public VipCustomer(String name, int creditLimit) {
        this(name,creditLimit,"default@demomail.com");
    }
}
