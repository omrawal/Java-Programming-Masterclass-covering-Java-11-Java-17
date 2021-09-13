package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }
    private String addition1Name;
    private double addition1Price=0;
    private String addition2Name;
    private double addition2Price=0;
    private String addition3Name;
    private double addition3Price=0;
    private String addition4Name;
    private double addition4Price=0;
    public void addHamburgerAddition1(String name,double price){
        this.addition1Name=name;
        this.addition1Price=price;
    }
    public void addHamburgerAddition2(String name,double price){
        this.addition2Name=name;
        this.addition2Price=price;
    }
    public void addHamburgerAddition3(String name,double price){
        this.addition3Name=name;
        this.addition3Price=price;
    }
    public void addHamburgerAddition4(String name,double price){
        this.addition4Name=name;
        this.addition4Price=price;
    }
    public double itemizeHamburger(){
        return this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
    }
}
