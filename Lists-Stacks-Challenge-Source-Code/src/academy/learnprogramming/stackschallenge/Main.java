package academy.learnprogramming.stackschallenge;

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
        int mid=0;
        Stack <String> stack=new Stack<String>();
        if (newLength%2==0) {
            mid = (newLength / 2); //if less than mid push
            for(int i=0;i<string1.length();i++){
                if(i<mid){
                    String k=string1.substring(i,i+1);
                    stack.push(k);
//                    System.out.println("pushing "+k);
                }
                else{
                    String k=string1.substring(i,i+1);
                    if(!stack.isEmpty() && stack.peek().equals(k)){
                        String popped=stack.pop();
//                        System.out.println("popping "+popped);
                    }
                    else{
                        return false;
                    }
                }
            }
            if(stack.isEmpty()) return true;
            return false;
        }
        else {
            mid=(int)(newLength/2); // if less than mid push ; == mid skip
            for(int i=0;i<string1.length();i++){
                if(i<mid){
                    String k=string1.substring(i,i+1);
                    stack.push(k);
//                    System.out.println("pushing "+k);
                }
                else if(i==mid)continue;
                else{
                    String k=string1.substring(i,i+1);
                    if(!stack.isEmpty() && stack.peek().equals(k)){
                        String popped=stack.pop();
//                        System.out.println("popping "+popped);
                    }
                    else{
                        return false;
                    }
                }
            }
            if(stack.isEmpty()) return true;
            return false;
        }



    }
}
