package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);


    }

    private static int[] readElements(int count){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [count];
        int i=0;
        while(count!=i){
            arr[i]=sc.nextInt();
            i++;
        }
        sc.close();
        return arr;
    }
    private static int findMin(int arr[]){
//        return Arrays.stream(arr).min().getAsInt();
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }

}
