package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Integer> hashSet= new HashSet<>();
        Set <Integer> treeSet=new TreeSet<>();
        Set <Integer> linkedSet=new LinkedHashSet<>();

        // Hashset
        System.out.println("Hashset");
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(7);
        hashSet.add(15);
        for( int i:hashSet){
            System.out.println(i);
        }
        // Treeset
        System.out.println("Treeset");
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(15);
        for( int i:treeSet){
            System.out.println(i);
        }
        // Linkedset
        System.out.println("Linked Hash Set");
        linkedSet.add(5);
        linkedSet.add(4);
        linkedSet.add(7);
        linkedSet.add(15);
        for( int i:linkedSet){
            System.out.println(i);
        }
        // String would be sorted in lexicographical order


    }
}
