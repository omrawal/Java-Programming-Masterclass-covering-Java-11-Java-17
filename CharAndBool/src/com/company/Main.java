package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar='D';
        char myUnicode='\u0044'; //https://unicode-table.com/
        System.out.println(myChar);
        System.out.println(myUnicode);


        boolean myTrueBool=true;
        boolean myFalseBool=false;
        System.out.println(myTrueBool);
        System.out.println(myFalseBool);

        String myString="This is a string";
        System.out.println("My String is equal to "+myString);
        myString=myString+", and this is more";
        System.out.println("My String is equal to "+myString);
        myString+="\u00A9 2021";
        System.out.println("My String is equal to "+myString);

    }
}
