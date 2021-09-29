package com.data.structure.binaryTree;
import java.util.stream.IntStream;

public class ConstructTreefromPostorderandInorder
 {

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        
        return buildTreeHelper(postOrder,inOrder,0,inOrder.length-1,0,postOrder.length-1);
    }
    public static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder,int[] inOrder,int inS,int inE,int posS,int posE){
        if(inS>inE)
    		return null;
  
        int rootData = postOrder[posE];
        BinaryTreeNode<Integer> root = new  BinaryTreeNode<>(rootData);
        int leftOrderLength =  IntStream.rangeClosed(inS, inE).filter(token -> rootData==inOrder[token]).findFirst().orElse(-1);
        int leftinS= inS;
        int leftinE = leftOrderLength-1;
        int rightinS=leftOrderLength+1;
        int rightinE =inE;
        int leftpostS = posS;
        int leftpostE = posS-inS+leftOrderLength-1;
        int rightpostS = posE-inE+leftOrderLength;
        int rightpostE = posE-1;
        root.left = buildTreeHelper(postOrder, inOrder, leftinS, leftinE, leftpostS, leftpostE);
        root.right = buildTreeHelper(postOrder, inOrder, rightinS, rightinE, rightpostS, rightpostE);
        return root;
    }

}