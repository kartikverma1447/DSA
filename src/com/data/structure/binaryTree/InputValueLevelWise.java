package com.data.structure.binaryTree;

import java.util.Scanner;

import data.structure.stackAndQueue.QueryEmptyException;
import data.structure.stackAndQueue.Queue;
import data.structure.tree.QueueEmptyException;

public class InputValueLevelWise {

	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		Queue<BinaryTreeNode<Integer>> pendingNodes = new Queue<>();
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
			} catch (QueryEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + front.data);
			int leftChild = s.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}

			System.out.println("Enter right child of " + front.data);
			int rightChild = s.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		return root;
	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		// Your code goes here
		Queue<BinaryTreeNode<Integer>> pendingqueue = new Queue<BinaryTreeNode<Integer>>();
		pendingqueue.enqueue(root);
		while (!pendingqueue.isEmpty()) {
			BinaryTreeNode<Integer> tree = null;
			try {
				tree = pendingqueue.dequeue();
			} catch (QueryEmptyException e) {
				
			}
			System.out.print(tree.data + ":");
			if (tree.left != null) {
				pendingqueue.enqueue(tree.left);
				System.out.print("L:" + tree.left.data);
			} else {
				System.out.print("L:-1");
			}
			if (tree.right != null) {
				pendingqueue.enqueue(tree.right);
				System.out.print(",R:" + tree.right.data);
			} else {
				System.out.print(",R:-1");
			}
			System.out.println();

		}
	}

}
