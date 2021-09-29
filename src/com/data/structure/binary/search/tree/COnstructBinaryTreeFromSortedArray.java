package com.data.structure.binary.search.tree;

import com.data.structure.binaryTree.BinaryTreeNode;

public class COnstructBinaryTreeFromSortedArray {

	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
            if(n==1){
                return new BinaryTreeNode<Integer>(arr[0]);
            }
			return SortedArrayToBSTHelper(arr,0,n-1);
		}

    public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr,int si,int ei){
        if(si>ei){
            return null;
        }

        int half = 0;
        half = (si+ei)/2;
    	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[half]);
        root.left = SortedArrayToBSTHelper(arr,si,half-1);
        root.right = SortedArrayToBSTHelper(arr,half+1,ei);
        return root;
        
    }
    
	}