package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i=0;i<5;i++){
            System.out.println("Loop on "+i);
        }
        challenge(29);

    }
    public static void challenge(int n){
        int primeCount=0;
        while(true){
            if(primeCount==3)
                break;
            if(isPrime(n)){
                primeCount++;
                System.out.println(n);
            }
            n++;
        }
    }
    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for( int i=2;i<=n/2;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

}
