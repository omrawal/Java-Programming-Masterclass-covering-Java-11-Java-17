package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calcFeetAndInchesToCentimeters(6,0));
    }
    public static double calcFeetAndInchesToCentimeters(int feet,int inches){
        if(feet>=0 && inches<=12 && inches>=0){
            double ans=2.54*inches + 12*feet*2.54;
            return ans;
        }
        else
            return -1;
    }
    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches>=0){
            return 2.54*inches;
        }
        else
            return -1;
    }
}
