package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

//        ArrayList
        List<String> a1=new ArrayList<>();
        a1.add("Jane");
        a1.add("John");
        a1.add("Silvester");
        System.out.println("Arraylist Elements: ");
        System.out.println(a1);

//        LinkedList
        List<String> a2=new LinkedList<>();
        a2.add("Jane");
        a2.add("John");
        a2.add("Silvester");
        System.out.println("Linkedlist Elements: ");
        System.out.println(a2);

//        HashSet
        Set<String>a3=new HashSet<>();
        a3.add("Jane");
        a3.add("John");
        a3.add("Silvester");
        System.out.println("HashSet Elements: ");
        System.out.println(a3);
        a3.add("Silvester");
        System.out.println("HashSet Elements After addition of duplicate: ");
        System.out.println(a3);

//        HashMap
        Map<Integer,String>a4=new HashMap<>();
        a4.put(1,"One");
        a4.put(2,"Two");
        a4.put(3,"Three");
        System.out.println("HashMap Elements: ");
        System.out.println(a4);
        a4.put(1,"Uno");
        System.out.println("HashMap Elements after updating: ");
        System.out.println(a4);
    }
}
