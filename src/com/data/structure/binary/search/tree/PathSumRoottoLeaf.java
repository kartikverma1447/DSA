package com.data.structure.binary.search.tree;

import com.data.structure.binaryTree.BinaryTreeNode;

public class PathSumRoottoLeaf {
    static boolean condition = true;


	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        condition = false;
        rootToLeafPathsSumToKUser(root,k,0,"");
	}
    public static void rootToLeafPathsSumToKUser(BinaryTreeNode<Integer> root,int k,int sum,String value){
	    if(k==sum&& value!="" && condition && root==null){
	            System.out.println(value);
            condition = false;
	            return;
	    }
    	if(root==null || k< sum){
            return;
        }

        int currSum = sum+root.data;
        value = value+root.data+" "; 
        condition = true;
        rootToLeafPathsSumToKUser(root.left,k,currSum,value);
        rootToLeafPathsSumToKUser(root.right,k,currSum,value);
    }

}