package com.data.structure.binaryTree;
import java.util.ArrayList;
import java.util.LinkedList;

import data.structure.LinkedList.LinkedListNode;


public class PrintZigZagTree {

	public static void printZigZag(BinaryTreeNode<Integer> root){
		 if(root==null){
            return;
        }
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		ArrayList<LinkedListNode<Integer>> finalList = new ArrayList<>();
		java.util.Queue<BinaryTreeNode<Integer>> peddingQueue = new LinkedList<>();
		BinaryTreeNode<Integer> nullValue = null;
		peddingQueue.add(root);
		peddingQueue.add(nullValue);
		while (!peddingQueue.isEmpty()) {
			BinaryTreeNode<Integer> tree = peddingQueue.remove();
			if (tree == null && !peddingQueue.isEmpty()) {
				peddingQueue.add(nullValue);
				finalList.add(head);
				head = null;
				tail = null;
			} else if (!peddingQueue.isEmpty()) {
				if (head == null) {
					head = new LinkedListNode<Integer>(tree.data);
					tail = head;
				} else {
					tail.next = new LinkedListNode<Integer>(tree.data);
					tail = tail.next;
				}
				if (tree.left != null)
					peddingQueue.add(tree.left);
				if (tree.right != null)
					peddingQueue.add(tree.right);

			}
		}
       finalList.add(head); 
       int count = 0;
	   for(LinkedListNode<Integer> list :  finalList){
           if(count%2==0){
               while(list!=null){
            	   System.out.print(list.data+" ");
                   list = list.next;
               }

           }
           else{
        	    LinkedListNode prev = null;
        	    LinkedListNode next = null;
        	    LinkedListNode current = list;
        	     while(current!=null){
        	         next = current.next;
        	         current.next = prev;
        	         prev = current;
        	         current = next;
        	     }
        	        list = prev;
        	        while(list!=null){
        	            System.out.print(list.data+" ");
        	            list = list.next;
        	        }

           }
    System.out.println();
       count++;   
       }

	}

}