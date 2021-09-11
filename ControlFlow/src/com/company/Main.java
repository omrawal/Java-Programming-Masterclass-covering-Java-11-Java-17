package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // instead of else if we use switch statement for a clean code
        switchFun('Z');
    int value=22;
    switch (value){
        case 1:
            System.out.println("hello");
            System.out.println("value is 1");
            break;
        case 2:
            System.out.println("hi");
            System.out.println("value 2");
            break;
        case 3: case 4: case 5:
            System.out.println("was 3 or 4 or 5");
            break;
        default:
            System.out.println("Default running");
    }
        System.out.println("Out of Switch");
    }
    public static void switchFun(char switchInput){
        switch (switchInput){
            case 'A':
                System.out.println("'A'Found");
                break;
            case 'B':
                System.out.println("'B'Found");
                break;
            case 'C':
                System.out.println("'C'Found");
                break;
            case 'D':
                System.out.println("'D'Found");
                break;
            case 'E':
                System.out.println("'E'Found");
                break;
            default:
                System.out.println("Not Found");
        }
    }
}
