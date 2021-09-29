package com.data.structure.binary.search.tree;

import com.data.structure.binaryTree.BinaryTreeNode;

public class LcaBST {
	
		public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
			if(root==null){
	            return -1;
	        }
	        if(a==root.data || b==root.data){
	            return root.data;
	        }
	        if(a<root.data && b<root.data){
	           return  getLCA(root.left,a,b);
	        }
	        if(b>root.data && a>root.data){
	          return  getLCA(root.right,a,b);
	        }
	        if((a<root.data && b>root.data )|| (a>root.data && b<root.data)){
	            return root.data;
	        }

	        return root.data;
	}
}