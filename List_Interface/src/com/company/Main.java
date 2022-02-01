package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ArrayList
        List<String> l1=new ArrayList<>();
        l1.add("Zara");
        l1.add("Mehnaz");
        l1.add("Ayan");
        System.out.println("The arrayList elements are: ");
        System.out.println(l1);
        System.out.println(l1.contains("zara"));
        l1.addAll(new ArrayList<String>(Arrays.asList("Geeks","for","Geeks")));
        System.out.println("The arrayList elements after addition are: ");
        System.out.println(l1);
        ListIterator<String> iter=l1.listIterator();
        for(String ele:l1){
            System.out.print(ele);
        }
        System.out.println("#####");
        while(iter.hasNext()){
            System.out.print(iter.next());
        }

    }
}
