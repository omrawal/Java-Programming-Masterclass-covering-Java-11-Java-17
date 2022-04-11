package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int nums[]={1,2,2,2,3,3};
    int k=2;
        System.out.println(topKFrequent(nums,k));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int num :nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else {
                map.put(num,1);
            }
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();

        Iterator iter=map.keySet().iterator();
        while(iter.hasNext()){
            int kk=(int)iter.next();
            System.out.println(kk+"->"+map.get(kk));
            ArrayList<Integer>lst=new ArrayList<>();
            lst.add(kk);
            lst.add(map.get(kk));
            list.add(lst);
        }
        Collections.sort(list,(i1,i2)->i2.get(1).compareTo(i1.get(1)));
//        System.out.println(list);
//        return new int[]{1,2,3};
            int[]ans=new int[k];
            for(int i=0;i<k;i++){
                ans[i]=list.get(i).get(0);
            }
            return ans;
    }
}
