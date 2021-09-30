package data.structure.tree;

public class SecondLargestElement {

	static class pair<T> {
		public T second = null;
		public T first = null;

		public pair(T largest, T secondLargest) {
			first = largest;
			second = secondLargest;
		}
	}

	private static pair<TreeNode<Integer>> findSecondLargestHelper(TreeNode<Integer> root) {
		pair<TreeNode<Integer>> output = null;
		if (root == null) {
			output = new pair<TreeNode<Integer>>(null, null);
			return output;
		}
		output = new pair<TreeNode<Integer>>(root, null);
		for (int i = 0; i < root.children.size(); i++) {
			pair<TreeNode<Integer>> children = findSecondLargestHelper(root.children.get(i));
			if (children.first.data > output.first.data) {
				if (children.second == null || children.second.data < output.first.data) {
					output.second = output.first;
					output.first = children.first;
				} else {
					output.first = children.first;
					output.second = children.second;
				}
			} else if (children.first.data.equals(output.first.data) && children.second != null) {
				if (output.second == null || children.second.data > output.first.data) {
					output.second = children.second;
				}
			} else if (output.first.data != children.first.data
					&& (children.first.data > output.second.data || output.second == null)) {
				output.second = children.first;
			}
		}
		return output;
	}

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {
		// TODO Auto-generated method stub
		return findSecondLargestHelper(root).second;
	}

}
