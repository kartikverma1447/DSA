package com.data.structure.binary.search.tree;

import com.data.structure.binaryTree.BinaryTreeNode;

public class IsBST {

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
    public static boolean isBSTUtil(BinaryTreeNode<Integer> node, int min, int max)
	    {
	        if (node == null)
	            return true;
	        if (node.data < min || node.data > max)
	            return false;
	        return (isBSTUtil(node.left, min, node.data-1) &&
	                isBSTUtil(node.right, node.data+1, max));

	    }

}