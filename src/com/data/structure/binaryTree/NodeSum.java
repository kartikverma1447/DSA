package com.data.structure.binaryTree;

public class NodeSum {

	public static int getSum(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int  sum = 0;
        sum+=getSum(root.left);
        sum+=getSum(root.right);
        sum+=root.data;
        return sum;
	}

}