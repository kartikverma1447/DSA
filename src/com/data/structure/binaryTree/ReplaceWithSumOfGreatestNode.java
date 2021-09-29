package com.data.structure.binaryTree;
public class ReplaceWithSumOfGreatestNode {

	

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        replaceWithLargerNodesSumHelper(root,0);

	}
    public static int replaceWithLargerNodesSumHelper(BinaryTreeNode<Integer> root,int sum){
        if(root==null)
            return sum;
        sum=replaceWithLargerNodesSumHelper(root.right,sum);
        sum=sum+root.data;
        root.data=sum;
        sum=replaceWithLargerNodesSumHelper(root.left,sum);
		return sum;
    }
    
}