package com.company;

public class Main {
    
    public static void main(String[] args) {
	// write your code here
        int res=calculateScore("Bob",100);
        calculateScore("Tesla");
    }
    public static int calculateScore(String name,int score){
        System.out.println(name+" scored "+score+" points.");
        return score*100;
    }
    public static int calculateScore(String name){
        System.out.println(name+" scored "+"Unknown"+" points.");
        return -1;
    }
}
