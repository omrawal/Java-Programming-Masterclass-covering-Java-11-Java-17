package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter Size of array: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        sortDesc(arr);
        System.out.println("Array sorted in Descending Order: ");
        printArray(arr);

    }
    public  static int[] sortDesc(int []arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void printArray(int arr[]){
//        System.out.println("The array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+i+"contents "+arr[i]);
        }
    }
    public static int[] getIntegers(int n){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
}
