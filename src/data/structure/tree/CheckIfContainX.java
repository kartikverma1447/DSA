package data.structure.tree;
public class CheckIfContainX {


	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

        if(root==null){
            return false;
        }
        if(String.valueOf(root.data).equals(String.valueOf(x))){
            return true;
        }
        for(int i=0;i<root.children.size();i++){
         return  checkIfContainsX(root.children.get(i),x);
        }
		return true;
	}
	
}
