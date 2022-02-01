package com.company;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<String> st=new Stack<>();
        st.push("First");
        st.push("Second");
        st.push("Third");
        st.push("Fourth");

        Iterator iter=st.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("The top is "+st.peek());
        System.out.println("Second is at pos "+(st.size()-st.search("Second")+1));
        System.out.println("Capacity is "+st.capacity()+" Size is "+ st.size());
        st.push("First");
        System.out.println("Capacity is "+st.capacity()+" Size is "+ st.size());
        st.push("Second");
        System.out.println("Capacity is "+st.capacity()+" Size is "+ st.size());
        st.push("Third");
        System.out.println("Capacity is "+st.capacity()+" Size is "+ st.size());
        st.push("Fourth");
        System.out.println("Capacity is "+st.capacity()+" Size is "+ st.size());
        st.push("Third");
        System.out.println("Capacity is "+st.capacity()+" Size is "+ st.size());
        st.push("Fourth");
        System.out.println("Capacity is "+st.capacity()+" Size is "+ st.size());
        st.push("Third");
        System.out.println("Capacity is "+st.capacity()+" Size is "+ st.size());
        st.push("Fourth");
        System.out.println("Capacity is "+st.capacity()+" Size is "+ st.size());
        // Stack at backend uses vector

    }
}
