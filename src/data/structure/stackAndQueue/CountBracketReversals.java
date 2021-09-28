package data.structure.stackAndQueue;

import java.util.EmptyStackException;
import java.util.Stack;

public class CountBracketReversals {

	public static int countBracketReversals(String input) {
		Stack<Character> stack = new Stack<Character>();
		for (char a : input.toCharArray()) {
			try {
				if (a == '}' && stack.peek() == '{') {
					stack.pop();
				} else {
					stack.push(a);
				}
			} catch (EmptyStackException e) {
				stack.push(a);
			}
		}
		int count = 0;
		try {
			while (!stack.isEmpty()) {
				if (stack.pop() != stack.pop()) 
				 count++;
				count++;
			}
		} catch (EmptyStackException e) {
			return -1;
		}
		return count;

	}

}