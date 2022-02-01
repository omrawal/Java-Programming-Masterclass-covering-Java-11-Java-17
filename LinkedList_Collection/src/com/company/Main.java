package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String>l1= new LinkedList<>();
        l1.add("C");
        l1.add("D");
        l1.add("E");
        l1.addFirst("a");
        l1.addLast("f");
        System.out.println(l1);
        System.out.println(Arrays.toString(l1.toArray()));

    }

}
