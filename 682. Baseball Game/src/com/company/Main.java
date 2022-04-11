package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String ops[]=new String[]{"5","2","C","D","+"}; //30
//        String ops[]=new String[]{"5","-2","4","C","D","9","+","+"}; //27
        String ops[]=new String[]{"1"}; //1
        System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for( String op:ops) {
            switch (op){
                case "C":{
                    stack.pop();
                    break;
                }
                case "D":{
                    stack.push(stack.peek()*2);
                    break;
                }
                case "+":{
                    int last=stack.pop();
                    int secLast=stack.pop();
                    stack.push(secLast);
                    stack.push(last);
                    stack.push(secLast+last);
                    break;
                }
                default:{
                    stack.push(Integer.parseInt(op));
                    break;
                }
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
}
}
