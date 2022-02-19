package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    static int  ans=-999;
    public static void main(String[] args) {
	// write your code here
        int []arr={5,3,1,2,6,7,9,2,1,5,3,14,9,3,14,9,2};
        int k=10;
        System.out.println("Bruteforce Ans is  -> "+kthsmallestBruteforce(arr,k));
        System.out.println("Better Ans is  -> "+kthsmallestBetter(arr,k));
        System.out.println("Optimal Ans is  -> "+kthsmallestOptimal(arr,0,arr.length-1,k));

    }


    // Bruteforce solution is sort and return element at k-1 th index
    // Time O(nlogn)
    // Space O(1)
    public static int kthsmallestBruteforce(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    // Better is creating a MaxHeap Inserting all elements and polling first k-1 ele and returning kth ele
    // Time O(nlogn)+O(nlogn)
    // Space O(n) heap
    public static int kthsmallestBetter(int arr[],int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue <Integer>();
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
        }
        for(int i=0;i<k-1;i++){
            int ele=minHeap.poll();
//            System.out.println()
        }
        return minHeap.poll();

    }
    public static int partition(int [] arr, int l, int r){
        int pivot=arr[r]; // selecting end element as pivot (can randomize it)
        int pindex=l;
        for(int i=l;i<r;i++){
            if(pivot>arr[i]){
                int temp=arr[pindex];
                arr[pindex]=arr[i];
                arr[i]=temp;
                pindex++;
            }
        }
        int temp=arr[pindex];
        arr[pindex]=arr[r];
        arr[r]=temp;
        return pindex;
    }
    public static int kthsmallestOptimal(int[] arr, int l, int r, int k)
    {
        //Your code here
        int pindex=partition(arr,l,r);
        if(pindex==k-1){
            return arr[pindex];
        }
        else if(pindex>k-1){
            return kthsmallestOptimal(arr,l,pindex-1,k);
        }
        else{
            return kthsmallestOptimal(arr,pindex+1,r,k);
        }
    }

}
