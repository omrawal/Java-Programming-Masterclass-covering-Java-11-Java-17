package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr={5,3,1,2,6,7,9,2,1,5,3,14,9,3,14,9,2};
        System.out.println("Array before sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        quicksort(arr,0,arr.length-1);
        System.out.println("Array after sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void quicksort(int []arr,int start,int end){
        if(start>=end){
            return;
        }
        int pindex=partition(arr,start,end);
        quicksort(arr,start,pindex-1);
        quicksort(arr,pindex+1,end);
    }
    public static int partition(int []arr,int start,int end){
        int pivot=arr[end]; // selecting end element as pivot (can randomize it)
        int pindex=start;
        for(int i=start;i<end;i++){
            if(pivot>arr[i]){
                int temp=arr[pindex];
                arr[pindex]=arr[i];
                arr[i]=temp;
                pindex++;
            }
        }
        int temp=arr[pindex];
        arr[pindex]=arr[end];
        arr[end]=temp;
        return pindex;
    }
}
