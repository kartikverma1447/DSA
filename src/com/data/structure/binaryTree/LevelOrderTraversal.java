package com.data.structure.binaryTree;

import data.structure.stackAndQueue.QueryEmptyException;
import data.structure.stackAndQueue.Queue;
import data.structure.tree.QueueEmptyException;

public class LevelOrderTraversal {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> pendingqueue = new Queue<BinaryTreeNode<Integer>>();
		pendingqueue.enqueue(root);
		BinaryTreeNode<Integer> nullValue = null;
		pendingqueue.enqueue(nullValue);
		while (!pendingqueue.isEmpty()) {
			BinaryTreeNode<Integer> tree = null;
			try {
				tree = pendingqueue.dequeue();
			} catch (QueryEmptyException e) {

			}
			if (tree == null&&!pendingqueue.isEmpty()) {
				pendingqueue.enqueue(nullValue);
				System.out.println();
			} else if(!pendingqueue.isEmpty()) {
				System.out.print(tree.data + " ");
				if (tree.left != null)
					pendingqueue.enqueue(tree.left);
				if (tree.right != null)
					pendingqueue.enqueue(tree.right);

			}
		}
	}
}