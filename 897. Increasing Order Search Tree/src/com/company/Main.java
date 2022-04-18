package com.company;

import com.sun.source.tree.Tree;

public class Main {

    public static void inorder(TreeNode root,TreeNode head){
        if(root==null)return;
        inorder(root.left,head);
        // inserting the node here
        TreeNode newNode=new TreeNode(root.val);
        if(head==null){
            head=newNode;
        }
        else{
            TreeNode temp=head;
            while(temp.right!=null){
                temp=temp.right;
            }
            temp.right=newNode;
        }
        inorder(root.right,head);
    }

    public static TreeNode increasingBST(TreeNode root) {
        TreeNode head=null;
        if(root==null)return null;
        inorder(root, head);
        return head;
    }
    public static void main(String[] args) {
	// write your code here
    }

}


