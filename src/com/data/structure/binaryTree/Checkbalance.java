package com.data.structure.binaryTree;

import java.lang.Math;

public class Checkbalance {

	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {

		if (root == null)
			return true;

		int leftHeight = height(root.left);
		int rHeight = height(root.right);
		if (Math.abs(leftHeight - rHeight) >= 1)
			return false;
		return checkBalanced(root.left) && checkBalanced(root.right);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int rightHight = 1;
		int leftHight = 1;
		leftHight = 1 + height(root.left);
		rightHight = 1 + height(root.right);
		if (leftHight >= rightHight) {
			return leftHight;
		} else
			return rightHight;
	}

}