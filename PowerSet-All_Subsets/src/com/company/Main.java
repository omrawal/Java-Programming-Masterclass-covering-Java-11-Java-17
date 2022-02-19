package com.company;

import java.util.*;

public class Main {

    public static void solve(List<List<Integer>>ans,int []nums,List<Integer>output,int index){
    if(index==nums.length){
        ans.add(new ArrayList<Integer>(output));
        return;
    }
        // Select
        output.add(nums[index]);
        solve(ans,nums,output,index+1);
        output.remove(output.size()-1);
        // Reject
        solve(ans,nums,output,index+1);

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        if(nums==null){
            return ans;
        }
        solve(ans,nums,new ArrayList<Integer>(),0);
        return ans;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(subsets(new int[]{1, 2, 3, 4}));

    }

}
