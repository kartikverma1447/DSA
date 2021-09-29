package com.data.structure.binary.search.tree;

import com.data.structure.binaryTree.BinaryTreeNode;

//package com.data.structure;
public class SearchNode {


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
       if(root==null){
           return false;
       }
        if(root.data==(k)){
            return true;
        }
        if(k>=root.data){
           return searchInBST(root.right,k);
        }
         return  searchInBST(root.left,k);
			        
        
	}
}