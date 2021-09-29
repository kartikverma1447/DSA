package com.data.structure.binaryTree;

public class NodeWithSibling {

	/**
	 * For a given Binary Tree of type integer, print all the nodes without any
	 * siblings.
	 * 
	 * In respect to the root, node data in the left subtree that satisfy the
	 * condition of not having a sibling would be 6, taken in a top-down
	 * sequence. Similarly, for the right subtree, 7 is the node data without
	 * any sibling.
	 * 
	 * Since we print the siblings in the left-subtree first and then the
	 * siblings from the right subtree, taken in a top-down fashion, we print 6
	 * 7.
	 * 
	 * @param root
	 */
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		// Your code goes here
		if (root == null) {
			return;
		}
		if (root.left != null && root.left != null) {
			printNodesWithoutSibling(root.left);
			printNodesWithoutSibling(root.right);
		}
		if (root.left != null && root.right == null) {
			System.out.print(root.left.data + " ");
			printNodesWithoutSibling(root.left);
		}
		if (root.left == null && root.right != null) {
			System.out.print(root.right.data + " ");
			printNodesWithoutSibling(root.right);
		}
	}

}