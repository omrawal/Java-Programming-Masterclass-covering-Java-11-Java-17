package com.company;

public class Main {

    public static void main(String[] args) {
// write your code here
        double d1 = 20.00d;
        double d2 = 80.00d;
        double d1d2 = d1 + d2;
        d1d2 *= 100.00d;
        double step4 = d1d2 % 40.00d;
        boolean step5 = (step4 == 0) ? true : false;
        System.out.println(step5);
        if (step5 != true) {
            System.out.println("Got some Remainder");
        }
    }
}
