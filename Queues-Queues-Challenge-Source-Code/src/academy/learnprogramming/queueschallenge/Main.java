package academy.learnprogramming.queueschallenge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        String newString=string.toLowerCase();
        String string1="";
        for(int i=0;i<newString.length();i++){
            if(Character.isLetter(newString.charAt(i))) string1 += newString.charAt(i);
        }
//        System.out.println(string+"----- The modified is ------"+string1);
//        return true;
        int newLength=string1.length();
        Queue <String> queue=new LinkedList<String>();
        Stack <String> stack=new Stack<String>();

        // inserting all in stack and queue
        for(int i=0;i<newLength;i++){
            String k=string1.substring(i,i+1);
            stack.push(k);
            queue.offer(k);
        }
        // pop from stack remove from queue
        while(!stack.isEmpty() && !queue.isEmpty()){
            String stackEle=stack.pop();
            String queueEle=queue.poll();
            if(!stackEle.equals(queueEle))return false;
        }
        if(!stack.isEmpty() || !queue.isEmpty()){
            return false;
        }
        return true;



        }

}
