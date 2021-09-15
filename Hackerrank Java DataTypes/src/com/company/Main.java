package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int ans=-1;
            int n= sc.nextInt();
            int s= sc.nextInt();
            int arrSum=(n*(n+1))/2;
            for (int j=1;j<=n;j++){
                if(arrSum-j==s){
                    ans=j;
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();

    }
}
