package com.data.structure.binaryTree;


public class MirrorBinaryTree {

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> leftDumb = root.left;
        root.left = root.right;
        root.right = leftDumb;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
	}
	
}