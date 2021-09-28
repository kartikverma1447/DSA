package data.structure.stackAndQueue;

public class BalancedParathentesis {

	public static boolean isBalanced(String expression) {

		Stack asd = new Stack();

		char[] zxcv = expression.toCharArray();
		for (char poi : zxcv) {
			if (poi == '(') {
				asd.push('(');
			} else {
				if (asd.isEmpty()) {
					return false;
				} else {
					asd.pop();
				}
			}
		}
		return asd.isEmpty();
	}
}