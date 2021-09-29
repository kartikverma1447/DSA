package com.data.structure.binary.search.tree;

import com.data.structure.binaryTree.BinaryTreeNode;

public class InsertDuplicate {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null){
            return;
        }
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
        BinaryTreeNode<Integer> dup = new BinaryTreeNode<Integer>(root.data);
        dup.left = root.left;
        root.left = dup;
	}
	
}