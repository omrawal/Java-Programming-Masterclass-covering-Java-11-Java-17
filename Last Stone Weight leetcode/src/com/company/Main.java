package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // link of problem = https://leetcode.com/problems/last-stone-weight/
        int [] stones ={1};
        System.out.println(lastStoneWeight(stones));
    }
    public static int lastStoneWeight(int[] stones) {
        if(stones.length==0)return 0;
        if(stones.length==1)return stones[0];
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>(Collections.reverseOrder());
        for (int stone:stones){
            maxHeap.add(stone);
        }
        boolean flag=true;
        while(flag && maxHeap.size()>1){
            int first=maxHeap.poll();
            int second=maxHeap.poll();
            if(first==second)continue;
            else if(first>second)maxHeap.add(first-second);
            else if(second>first)maxHeap.add(second-first);
            else flag=false;
        }
        if(maxHeap.isEmpty())return 0;
        else return maxHeap.poll();

    }
}
