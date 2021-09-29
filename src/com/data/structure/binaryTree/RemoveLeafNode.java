package com.data.structure.binaryTree;



import java.util.ArrayList;

public class RemoveLeafNode {

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
        
        if(root==null){
            return null;
        }
        if(root.left!=null){
        if(root.left.left==null && root.left.right==null){
            root.left=null;
        }
        }
        if(root.right!=null){
        if(root.right.left==null && root.right.right==null){
            root.right = null;
        }
        }
        removeAllLeaves(root.left);
        removeAllLeaves(root.right);
        return root;         
	}



}