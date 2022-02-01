package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector<String> vector=new Vector();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        System.out.println("Vector is "+vector);
        vector.remove("Two");
        vector.remove("Four");
        System.out.println("Vector is "+vector);
        System.out.println("Element at one "+vector.elementAt(1));
        System.out.println("Last index of "+vector.lastIndexOf("Three"));


    }
}
