package data.structure.tree;
public class NodeGreaterThenX {


	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here		
		if(root==null)
            return 0;
        int count=0;
        if(root.data>x){
            count++;
        }
        for(int i=0;i<root.children.size();i++){
           count=count+numNodeGreater(root.children.get(i),x);

        }
        return count;
	}
	
}
