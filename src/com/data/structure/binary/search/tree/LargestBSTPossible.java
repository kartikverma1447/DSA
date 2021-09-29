package com.data.structure.binary.search.tree;

import com.data.structure.binaryTree.BinaryTreeNode;

public class LargestBSTPossible {
	
    static int MAX = Integer.MAX_VALUE;
    static int MIN = Integer.MIN_VALUE;
    
    static class NodeInfo{
        int size;
        int max;
        int min;
        int ans;
        boolean isBST;
        public NodeInfo(){}
        public NodeInfo(int size,int max,int min,int ans,boolean isBST){
            this.size = size;
            this.max = max;
            this.min = min;
            this.ans = ans;
            this.isBST = isBST;
        }
    }
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root){
        return largestBSTSubtreeUser(root).ans;
    }
	
	public static NodeInfo largestBSTSubtreeUser(BinaryTreeNode<Integer> root) {
        if(root ==null){
               return new NodeInfo(0,MIN,MAX,0,true);
        }
        if(root.left==null && root.right==null){
            return new NodeInfo(1,root.data,root.data,1,true);
        }
        NodeInfo leftNode = largestBSTSubtreeUser(root.left);
        NodeInfo rightNode = largestBSTSubtreeUser(root.right);
        NodeInfo nodeInfo = new NodeInfo();
        nodeInfo.size = 1 + Math.max(leftNode.size, rightNode.size);
        if(leftNode.isBST && rightNode.isBST && root.data >leftNode.max &&  rightNode.min>root.data ){
            nodeInfo.min = Math.min(Math.min(leftNode.min, rightNode.min), root.data);
            nodeInfo.max = Math.max(Math.max(leftNode.max,rightNode.max),root.data);
            nodeInfo.isBST = true;
            nodeInfo.ans = nodeInfo.size;
            return nodeInfo;
        }
        nodeInfo.ans = Math.max(leftNode.ans, rightNode.ans);
        nodeInfo.isBST  = false;
        return nodeInfo;
        
	}

}