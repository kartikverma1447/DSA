package data.structure.tree;

public class MiscQuestion {

    static class ChildNodeData<T>{
        T node;
        int sum;
        ChildNodeData(int sum,T node){
            this.sum = sum;
            this.node = node;
        }
        }
        
        
    
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		return maxTreeNodeHelper(root).node;
	}
    
    public static ChildNodeData<TreeNode<Integer>> maxTreeNodeHelper(TreeNode<Integer> root){
    	ChildNodeData<TreeNode<Integer>> output = null;
        if(root == null){
            return (new ChildNodeData<TreeNode<Integer>>(0, null));
        }
        //findSum
        int sum = root.data;
        for(int i=0;i<root.children.size();i++){
        	sum+=root.children.get(i).data;
        }
        output = new ChildNodeData<TreeNode<Integer>>(sum, root);
        for(int i=0;i<root.children.size();i++){
        	ChildNodeData<TreeNode<Integer>> childPair = maxTreeNodeHelper(root.children.get(i));
        	if(childPair.sum>=output.sum){
        		output.sum=childPair.sum;
        		output.node = childPair.node;
        	}
        }
        
        return output;
    }
	
		
}
