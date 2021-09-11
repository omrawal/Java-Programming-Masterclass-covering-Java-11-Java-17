package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {1500, 900, 400, 50};
        int i = 0;
        for (i = 0; i < 4; i++) {
            displayhighScorePosition(Integer.toString(i + 1), calculateHighScorePosition(arr[i]));
        }
        greet("Java");
        greet("Microsoft");
        greet("Amazon");
    }

    public static void displayhighScorePosition(String pname, int pos) {
        System.out.println(pname + " managed to get into position " + pos + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        }
        return 4;
    }

    public static void greet(String s) {
        System.out.println("Hello " + s + " !");

    }
}
