package com.data.structure.binary.search.tree;

import com.data.structure.binaryTree.BinaryTreeNode;

import data.structure.LinkedList.LinkedListNode;

class PairOfElementNode{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
}


public class BSTFromFromSortedLinkedList {
	
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root){
		return generateLinkedListUsers(root).head;
	}

	private static PairOfElementNode generateLinkedListUsers(BinaryTreeNode<Integer> root) {
		if(root==null){
			PairOfElementNode node = new PairOfElementNode();
			return node;
		}
		LinkedListNode<Integer> rootNode = new LinkedListNode<Integer>(root.data);
		PairOfElementNode leftNode = generateLinkedListUsers(root.left);
		PairOfElementNode rightNode = generateLinkedListUsers(root.right);
		PairOfElementNode pairSet = new PairOfElementNode();
		if(leftNode.tail != null){
			leftNode.tail.next = rootNode;
		}
		rootNode.next = rightNode.head;
		if(leftNode.head!=null){
			pairSet.head = leftNode.head;
		}else{
			pairSet.head = rootNode;
		}if(rightNode.tail!=null){
			pairSet.tail = rightNode.tail;
		}else{
			pairSet.tail = rootNode;
		}
		return pairSet;
	}
	
}