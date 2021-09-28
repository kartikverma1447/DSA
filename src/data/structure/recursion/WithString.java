package data.structure.recursion;

import java.util.ArrayList;

public class WithString {

	/**
	 * Check whether a given String S is a palindrome using recursion. Return
	 * true or false.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isStringPalindrome(String input) {
		return isStringPalindrome(input, 0, input.length() - 1);
	}

	/**
	 * Check whether a given String S is a palindrome using recursion. Return
	 * true or false.
	 * 
	 * @param input
	 * @param index
	 * @param lastIndex
	 * @return
	 */
	public static boolean isStringPalindrome(String input, int index, int lastIndex) {
		if (input.length() == lastIndex) {
			return true;
		}
		if (index == lastIndex) {
			return true;
		}
		if (input.charAt(index) != input.charAt(lastIndex)) {
			return false;
		}
		if (index < lastIndex + 1)
			return isStringPalindrome(input, ++index, --lastIndex);
		return true;
	}

	/**
	 * Given a string, compute recursively a new string where all appearances of
	 * "pi" have been replaced by "3.14".
	 * 
	 * @param input
	 * @return
	 */
	public static String replace(String input) {
		return replace(input, 0);
	}

	/**
	 * Given a string, compute recursively a new string where all appearances of
	 * "pi" have been replaced by "3.14".
	 * 
	 * @param input
	 * @param index
	 * @return
	 */
	public static String replace(String input, int index) {
		if (index >= input.length()) {
			return "";
		}
		if (index >= input.length() - 1) {
			return String.valueOf(input.charAt(index));
		}
		if (input.charAt(index) == 'p') {
			if (input.charAt(index + 1) == 'i') {
				index++;
				return "3.14" + replace(input, ++index);
			}
		}
		return String.valueOf(input.charAt(index)) + replace(input, ++index);
	}

	/**
	 * Given a string, compute recursively a new string where all 'x' chars have
	 * been removed.
	 * 
	 * @param input
	 * @return
	 */
	public static String removeX(String input) {
		if (0 == input.length()) {
			return "";
		}
		if (input.charAt(0) == 'x') {
			return removeX(input.substring(1));
		}
		return input.charAt(0) + removeX(input.substring(1));
	}

	/**
	 * Write a recursive function to convert a given string into the number it
	 * represents. That is input will be a numeric string that contains only
	 * numbers, you need to convert the string into corresponding integer and
	 * return the answer.
	 * 
	 * @param input
	 * @return
	 */
	public static int convertStringToInt(String input) {
		return convertStringToInt(input, input.length());
	}

	/**
	 * Write a recursive function to convert a given string into the number it
	 * represents. That is input will be a numeric string that contains only
	 * numbers, you need to convert the string into corresponding integer and
	 * return the answer.
	 * 
	 * @param input
	 * @param index
	 * @return
	 */
	public static int convertStringToInt(String input, int index) {
		if (index == 0) {
			return 0;
		}
		return Integer.parseInt((convertStringToInt(input, --index) + "")) * 10
				+ Integer.parseInt(input.charAt(index) + "");
	}

	

	/**
	 * Given a string S, compute recursively a new string where identical chars
	 * that are adjacent in the original string are separated from each other by
	 * a "*".
	 * 
	 * @param s
	 * @return
	 */
	public static String addStars(String s) {
		// Write your code here
		return addStars(s, 0);

	}

	/**
	 * Given a string S, compute recursively a new string where identical chars
	 * that are adjacent in the original string are separated from each other by
	 * a "*".
	 * 
	 * @param s
	 * @param index
	 * @return
	 */
	public static String addStars(String s, int index) {
		if (s.length() - 1 == index) {
			return String.valueOf(s.charAt(index));
		}
		if (s.charAt(index) == s.charAt(index + 1)) {
			return s.charAt(index) + "*" + addStars(s, ++index);
		}
		return String.valueOf(s.charAt(index)) + addStars(s, ++index);
	}

	/**
	 * Given an input string S and two characters c1 and c2, you need to replace
	 * every occurrence of character c1 with character c2 in the given string.
	 * 
	 * @param input
	 * @param c1
	 * @param c2
	 * @return
	 */
	public static String replaceCharacter(String input, char c1, char c2) {
		if (input.length() == 0) {
			return "";
		}
		if (input.charAt(0) == c1) {
			return c2 + replaceCharacter(input.substring(1), c1, c2);
		}

		return input.charAt(0) + replaceCharacter(input.substring(1), c1, c2);
	}

	/**
	 * Given a string S, remove consecutive duplicates from it recursively.
	 * 
	 * @param s
	 * @return
	 */
	public static String removeConsecutiveDuplicates(String s) {
		if (s.length() == 1) {
			return s.charAt(0) + "";
		}
		if (s.charAt(0) == s.charAt(1)) {
			return removeConsecutiveDuplicates(s.substring(1));
		}
		return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
	}
	
	
	/**
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 **/

	/**
	 * if else condition containing all sequence
	 * 
	 * @param n
	 * @return
	 */
	public static char[] helper(int n) {
		if (n == 2) {
			char[] seq = { 'a', 'b', 'c' };
			return seq;
		} else if (n == 3) {
			char[] seq = { 'd', 'e', 'f' };
			return seq;
		} else if (n == 4) {
			char[] seq = { 'g', 'h', 'i' };
			return seq;
		} else if (n == 5) {
			char[] seq = { 'j', 'k', 'l' };
			return seq;
		} else if (n == 6) {
			char[] seq = { 'm', 'n', 'o' };
			return seq;
		} else if (n == 7) {
			char[] seq = { 'p', 'q', 'r', 's' };
			return seq;
		} else if (n == 8) {
			char[] seq = { 't', 'u', 'v' };
			return seq;
		} else if (n == 9) {
			char[] seq = { 'w', 'x', 'y', 'z' };
			return seq;
		}
		return new char[0];
	}

	/**
	 * Given an integer n, using phone keypad find out all the possible strings
	 * that can be made using digits of input n.
	 * 
	 * Return empty string for numbers
	 * 
	 * 
	 * 0 and 1.
	 * 
	 * Note : 1. The order of strings are not important.
	 * 
	 * 2. Input and output has already been managed for you. You just have to
	 * populate the output array and return the count of elements populated in
	 * the output array.
	 * 
	 * @param n
	 * @return
	 */
	public static String[] keypad(int n) {
		if (n == 0) {
			String[] arr = { "" };
			return arr;
		}
		int value = n % 10;
		String subAns[] = keypad(n / 10);
		char seq[] = helper(value);
		String ans[] = new String[subAns.length * seq.length];
		int k = 0;
		for (int i = 0; i < subAns.length; i++) {
			for (int j = 0; j < seq.length; j++) {
				ans[k++] = subAns[i] + seq[j];
			}
		}
		return ans;
	}

	/**
	 * Given an integer n, using phone keypad find out and print all the
	 * possible strings that can be made using digits of input n.
	 * 
	 * @param input
	 */
	public static void printKeypad(int input) {
		printKeypad(input, "");
	}

	/**
	 * Given an integer n, using phone keypad find out and print all the
	 * possible strings that can be made using digits of input n.
	 * 
	 * @param input
	 * @param output
	 */
	public static void printKeypad(int input, String output) {
		if (input == 0) {
			System.out.println(output);
			return;
		}
		char[] value = helper(input % 10);
		input = input / 10;
		for (int i = 0; i < value.length; i++) {
			printKeypad(input, value[i] + output);
		}
	}

	/**
	 * Suppose you have a string, S, made up of only 'a's and 'b's. Write a
	 * recursive function that checks if the string was generated using the
	 * following rules:
	 * 
	 * a. The string begins with an 'a'
	 * 
	 * b. Each 'a' is followed by nothing or an 'a' or "bb"
	 * 
	 * c. Each "bb" is followed by nothing or an 'a'
	 * 
	 * @param input
	 * @return
	 */
	public static boolean checkAB(String input) {
		if (input.length() == 0) {
			return true;
		}
		if (input.charAt(0) == 'a') {
			if (input.substring(1).length() > 1 && input.substring(1, 3).equals("bb")) {
				return checkAB(input.substring(3));
			} else {
				return checkAB(input.substring(1));
			}

		}
		return false;
	}

	// TODO Return all codes - String

	private static String[] finalArray = new String[0];
	private static int length = 0;

	/**
	 * Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given
	 * a numeric string S. Write a program to return the list of all possible
	 * codes that can be generated from the given string.
	 * 
	 * @param input
	 * @return
	 */
	public static String[] getCode(String input) {
		return getCode(input, "", 0);
	}

	public static String[] getCode(String input, String output, int index) {

		if (input.length() == 0) {
			refactorFinalString(output);
			return new String[0];
		}
		int vallue = Integer.parseInt(input.charAt(0) + "");
		char value = (char) ('a' + vallue - 1);
		getCode(input.substring(1), output + value, ++index);
		if (input.substring(1).length() >= 1) {
			int secondValue = Integer.parseInt(input.charAt(0) + "") * 10 + Integer.parseInt(input.charAt(1) + "");
			if (secondValue > 10 && secondValue <= 26) {
				char SecondVallue = (char) ('a' + secondValue - 1);
				getCode(input.substring(2, input.length()), output + SecondVallue, ++index);
			}
		}
		return finalArray;
	}

	private static void refactorFinalString(String output) {
		String[] asdf = finalArray;
		finalArray = new String[length + 1];
		for (int i = 0; i < asdf.length; i++)
			finalArray[i] = asdf[i];
		finalArray[length] = output;
		length++;
	}

	// TODO Print all codes
	/**
	 * Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given
	 * a numeric string S. Write a program to print the list of all possible
	 * codes that can be generated from the given string.
	 * 
	 * @param input
	 */
	public static void printAllPossibleCodes(String input) {
		printAllPossibleCodes(input, "", 0);
	}

	public static void printAllPossibleCodes(String input, String output, int index) {
		if (input.length() == 0) {
			System.out.println(output);
			return;
		}
		int vallue = Integer.parseInt(input.charAt(0) + "");
		char value = (char) ('a' + vallue - 1);
		printAllPossibleCodes(input.substring(1), output + value, ++index);
		if (input.substring(1).length() >= 1) {
			int secondValue = Integer.parseInt(input.charAt(0) + "") * 10 + Integer.parseInt(input.charAt(1) + "");
			if (secondValue > 10 && secondValue <= 26) {
				char SecondVallue = (char) ('a' + secondValue - 1);
				printAllPossibleCodes(input.substring(2, input.length()), output + SecondVallue, ++index);
			}
		}
	}

	// TODO Return Permutation of string
	/**
	 * Given a string S, find and return all the possible permutations of the
	 * input string. Note 1 : The order of permutations is not important. Note
	 * 2: If original string contains duplicate characters, permutations will
	 * also be duplicates. Input Format :
	 * 
	 * @param input
	 * @return
	 */
	public static String[] permutationOfString(String input) {
		if (input.length() == 0) {
			return new String[0];
		}

		char value = input.charAt(0);

		String ans[] = permutationOfString(input.substring(1));

		String[] finalAns = recreateNewString(input, ans);
		return finalAns;

	}

	private static String[] recreateNewString(String input, String[] ans) {
		int newValue = ans.length;
		if (ans.length == 0) {
			String[] asdf = new String[1];
			asdf[0] = input.charAt(0) + "";
			return asdf;
		}
		String[] finalResult = new String[(newValue)];
		char value = input.charAt(0);
		int k = 0;
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length() + 1; j++) {
				if (j == 0) {
					finalResult[k++] = value + ans[i];
				} else
					finalResult = enterRecords(finalResult, ans[i], value, j);
			}
		}
		return finalResult;

	}

	private static String[] enterRecords(String[] finalResult, String ans, char value, int j) {
		int value1 = finalResult.length;
		String[] asdf = finalResult;
		finalResult = new String[value1 + 1];
		for (int i = 0; i < asdf.length; i++) {
			finalResult[i] = asdf[i];
		}
		finalResult[value1] = ans.substring(0, j) + value + ans.substring(j, ans.length());
		return finalResult;
	}

	/**
	 * Given an input string (STR), print all possible permutations of the input
	 * string.
	 * 
	 * @param input
	 * @return
	 */
	public static ArrayList<String> FindPermutations(String input) {

		if (input.length() == 0) {
			return new ArrayList<>();
		}

		ArrayList<String> ans = FindPermutations(input.substring(1));
		ArrayList<String> finalAnswer = recursiveCall(input, ans);
		return finalAnswer;
	}

	private static ArrayList<String> recursiveCall(String input, ArrayList<String> ans) {
		if (ans.size() == 0) {
			ans.add(input.charAt(0) + "");
			return ans;
		}
		ArrayList<String> asdf = new ArrayList<>();
		for (String value : ans) {
			for (int i = 0; i <= value.length(); i++) {
				if (i == 0) {
					asdf.add(input.charAt(0) + value);
				} else
					asdf.add(value.substring(0, i) + input.charAt(0) + value.substring(i, value.length()));

			}
		}
		return asdf;
	}

}
