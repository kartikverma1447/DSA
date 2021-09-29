package com.data.structure.binaryTree;

public class LCA {

	/**
	 * Given a binary tree and data of two nodes, find 'LCA' (Lowest Common
	 * Ancestor) of the given two nodes in the binary tree.
	 * 
	 * @param root
	 * @param a
	 * @param b
	 * @return
	 */
	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

		if (root == null) {
			return -1;
		}
		if (root.data == a || root.data == b) {
			return root.data;
		}

		int a1 = getLCA(root.left, a, b);
		int b1 = getLCA(root.right, a, b);
		if (a1 == -1 && b1 == -1) {
			return -1;
		}
		if (a1 != -1 && b1 != -1) {
			return root.data;
		}
		if (a1 != -1) {
			return a1;
		} else {
			return b1;
		}

	}

}