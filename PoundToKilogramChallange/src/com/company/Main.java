package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight in Pound: ");
        double poundWeight=sc.nextDouble();
        sc.close();
        double kgWeight = poundWeight*0.45359237;
        System.out.println("Weight in Kilogram is = "+kgWeight);
    }
}
