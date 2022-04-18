package com.company;
import com.company.TreeNode;
public class Main {
    public void inorder(TreeNode root,int[]nums,int k){
        if(root==null)return;
        inorder(root.left,nums,k);
        if(nums[0]+1==k){
            nums[1]=root.val;
        }
        nums[0]++;
        inorder(root.right,nums,k);
    }

    public int kthSmallest(TreeNode root, int k) {
        int nums[]=new int[2]; // first is traversal count(k 0-k) second is the answer
        inorder(root,nums,k);
        return nums[1];
    }

    public static void main(String[] args) {
	// write your code here
    }

}
