package data.structure.tree;
public class replaceWithDepthValue {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	public static void replaceWithDepthValue(TreeNode<Integer> root){

        QueueUsingLL<TreeNode<Integer>> level = new QueueUsingLL<TreeNode<Integer>>();
        TreeNode<Integer> nullNode =  new TreeNode<Integer>(Integer.MIN_VALUE);
		level.enqueue(root);
        int set =0;
        root.data = set;
		level.enqueue(nullNode);
        set=set+1;
        while(level.size()!=1){
            TreeNode<Integer> temp = null;
            try{
                temp = level.dequeue();
            }catch(QueueEmptyException e){
                
            }
            if(temp==nullNode){
                set=set+1;
                level.enqueue(nullNode);
                continue;
            }
            for(int i=0;i<temp.children.size();i++){
                temp.children.get(i).data=set;
                level.enqueue(temp.children.get(i));
            }
        }
	}
	
}
