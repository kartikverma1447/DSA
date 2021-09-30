package data.structure.tree;
public class FindHeight {


	public static int getHeight(TreeNode<Integer> root){
		if(root==null){
            return 0;
        }
        int minheight=1;
        int height=minheight;

        for(int i=0;i<root.children.size();i++){
           height=1+getHeight(root.children.get(i));
        if(height>minheight){
        	minheight = height;
        }
        }

        return minheight;
	}
    
}
   