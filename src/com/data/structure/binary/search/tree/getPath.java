package com.data.structure.binary.search.tree;
import java.util.ArrayList;

import com.data.structure.binaryTree.BinaryTreeNode;

public class getPath {


	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if(root==null)
            return null;
        if(root.data==data){
            ArrayList<Integer> asdf = new ArrayList<>();
            asdf.add(root.data);
            return asdf;
        }
        if(root.data>data){
            ArrayList<Integer> leftOutput = getPath(root.left,data);
            if(leftOutput!=null){
                leftOutput.add(root.data);
                return leftOutput;
            }
        }
        if(root.data<data){
            ArrayList<Integer> rightData = getPath(root.right,data);
            if(rightData!=null){
                rightData.add(root.data);
                return rightData;
            }
        }
        return null;
	}
    
}