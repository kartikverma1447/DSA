package data.structure.tree;

public class NextLargestChild {


		public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {
		if (root == null)
			return null;
        TreeNode<Integer>nextLargestElement=null;
		if (root.data > n) {
                nextLargestElement = root;
		}
		for (int i = 0; i < root.children.size(); i++) {
		TreeNode<Integer> nextElementInChild = 	findNextLargerNode(root.children.get(i), n);
		if(nextElementInChild!=null){
            if(nextLargestElement==null||nextElementInChild.data<nextLargestElement.data)
                nextLargestElement = nextElementInChild;
        }
		}
		return nextLargestElement;
	}
}
