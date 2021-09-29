package com.data.structure.binaryTree;


public class HeightOfBT {

	public static int height(BinaryTreeNode<Integer> root) {

        if(root==null){
            return 0;
        }
        int rightHight  = 1;
        int leftHight = 1;
        leftHight =  1+height(root.left);
        rightHight =  1+height(root.right);
        if(leftHight>rightHight){
            return leftHight;
        }
        else
        return rightHight;
	}

}