package data.structure.recursion;

public class WithArray {

	/**
	 * Given an array of length N, you need to find and return the sum of all
	 * elements of the array.
	 * 
	 * @param input
	 * @return
	 */
	public static int sumOfArray(int input[]) {
		if (input.length == 1) {
			return input[0];
		}
		int[] smallInput = new int[input.length - 1];
		for (int i = 0; i < input.length - 1; i++) {
			smallInput[i] = input[i + 1];
		}
		int value = sumOfArray(smallInput) + input[0];
		return value;
	}

	/**
	 * Given an array of length N and an integer x, you need to find if x is
	 * present in the array or not. Return true or false.
	 * 
	 * @param input
	 * @param x
	 * @return
	 */
	public static boolean checkNumber(int input[], int x) {
		if (input.length == 1) {
			if (input[0] == x) {
				return true;
			}
		}
		if (input.length == 0) {
			return false;
		}

		if (input[0] == x) {
			return true;
		}
		int[] smallInput = new int[input.length - 1];
		for (int i = 0; i < input.length - 1; i++) {
			smallInput[i] = input[i + 1];
		}
		if (checkNumber(smallInput, x)) {
			return true;
		}
		return false;
	}

	/**
	 * find the first Index in array
	 * 
	 * @param input
	 * @param x
	 * @return
	 */
	public static int firstIndex(int input[], int x) {
		return firstIndex(input, x, 0);
	}

	/**
	 * findFirstIndexHelper
	 * 
	 * @param input
	 * @param x
	 * @param startIndex
	 * @return
	 */
	private static int firstIndex(int input[], int x, int startIndex) {
		if (startIndex == input.length) {
			return -1;
		}
		if (input[startIndex] == x) {
			return startIndex;
		}
		return firstIndex(input, x, startIndex + 1);
	}

	/**
	 * Given an array of length N and an integer x, you need to find and return
	 * the last index of integer x present in the array. Return -1 if it is not
	 * present in the array.
	 * 
	 * 
	 * @param input
	 * @param x
	 * @return
	 */
	public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, input.length);

	}

	/**
	 * Given an array of length N and an integer x, you need to find and return
	 * the last index of integer x present in the array. Return -1 if it is not
	 * present in the array.
	 * 
	 * 
	 * @param input
	 * @param x
	 * @param lastIndex
	 * @return
	 */
	private static int lastIndex(int input[], int x, int lastIndex) {

		int value = -1;

		if (lastIndex == 1) {
			return -1;
		}
		if (input[input.length - 1] == x) {
			return input.length - 1;
		}
		value = lastIndex(input, x, --lastIndex);

		int asdf = input[lastIndex - 1];
		if (asdf == x) {
			value = lastIndex - 1;
		}
		return value;
	}

	/**
	 * Input array to store all value in the array
	 */
	static int inputValue[] = new int[0];

	/**
	 * Given an array of length N and an integer x, you need to find all the
	 * indexes where x is present in the input array. Save all the indexes in an
	 * array (in increasing order).
	 * 
	 * 
	 * @param input
	 * @param x
	 * @return
	 */
	public static int[] allIndexes(int input[], int x) {

		return allIndexes(input, x, 0);

	}

	/**
	 * Given an array of length N and an integer x, you need to find all the
	 * indexes where x is present in the input array. Save all the indexes in an
	 * array (in increasing order).
	 * 
	 * @param input
	 * @param x
	 * @param startIndex
	 * @return
	 */
	public static int[] allIndexes(int input[], int x, int startIndex) {

		if (startIndex == input.length - 1) {
			if (input[input.length - 1] == x) {
				restructure(input.length - 1);
			}
			return inputValue;
		}
		if (input[startIndex] == x) {
			restructure(startIndex);
		}
		allIndexes(input, x, ++startIndex);

		return inputValue;

	}

	/**
	 * to restructure the length of the array
	 * 
	 * @param value
	 * @return
	 */

	
	private static int[] restructure(int value) {
		int temp[] = inputValue;
		inputValue = new int[inputValue.length + 1];
		for (int i = 0; i < temp.length; i++) {
			inputValue[i] = temp[i];
		}
		inputValue[inputValue.length - 1] = value;
		return inputValue;
	}

	/**
	 * Given an integer array (of length n), find and print all the subsets of
	 * input array. Subsets are of length varying from 0 to n, that contain
	 * elements of the array. But the order of elements should remain same as in
	 * the input array. Note : The order of subsets are not important. Just
	 * print the subsets in different lines.
	 * 
	 * @param input
	 */
	public static void printSubsets(int input[]) {
		printSubsets(input, "", -1);
	}

	/**
	 * Given an integer array (of length n), find and print all the subsets of
	 * input array. Subsets are of length varying from 0 to n, that contain
	 * elements of the array. But the order of elements should remain same as in
	 * the input array. Note : The order of subsets are not important. Just
	 * print the subsets in different lines.
	 * 
	 * @param input
	 * @param output
	 * @param index
	 */
	public static void printSubsets(int input[], String output, int index) {
		if (input.length - 1 == index) {
			System.out.println(output.trim() + " ");
			return;
		}
		index = ++index;
		printSubsets(input, output, index);
		printSubsets(input, output + " " + input[index], index);
	}

	/**
	 * Given an integer array A of size N, check if the input array can be
	 * splitted in two parts such that -
	 * 
	 * Sum of both parts is equal - All elements in the input, which are
	 * divisible by 5 should be in same group. - All elements in the input,
	 * which are divisible by 3 (but not divisible by 5) should be in other
	 * group. - Elements which are neither divisible by 5 nor by 3, can be put
	 * in any group.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean splitArray(int input[]) {
		return splitArray(input, input.length);
	}

	/**
	 * Given an integer array A of size N, check if the input array can be
	 * splitted in two parts such that -
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	static boolean splitArray(int arr[], int n) {
		return helper(arr, n, 0, 0, 0);
	}

	/**
	 * Given an integer array A of size N, check if the input array can be
	 * splitted in two parts such that -
	 * 
	 * @param arr
	 * @param n
	 * @param start
	 * @param lsum
	 * @param rsum
	 * @return
	 */
	static boolean helper(int arr[], int n, int start, int lsum, int rsum) {

		if (start == n)
			return lsum == rsum;

		if (arr[start] % 5 == 0)
			lsum += arr[start];
		else if (arr[start] % 3 == 0)
			rsum += arr[start];

		else

			return helper(arr, n, start + 1, lsum + arr[start], rsum)
					|| helper(arr, n, start + 1, lsum, rsum + arr[start]);

		return helper(arr, n, start + 1, lsum, rsum);

	}

	// TODO: return subset of an array

	/**
	 * Given an integer array (of length n), find and return all the subsets of
	 * input array. Subsets are of length varying from 0 to n, that contain
	 * elements of the array. But the order of elements should remain same as in
	 * the input array. Note : The order of subsets are not important.
	 * 
	 * 
	 * @param input
	 * @return
	 */
	public static int[][] subsets(int input[]) {
		int[][] arrayToBeHandled = subsets(input, 0);
		int[][] tempArray = new int[arrayToBeHandled.length - 1][];
		for (int i = 1; i < arrayToBeHandled.length; i++) {
			tempArray[i - 1] = new int[arrayToBeHandled[i].length - 1];
			for (int j = 0; j < arrayToBeHandled[i].length - 1; j++) {
				tempArray[i - 1][j] = arrayToBeHandled[i][j];
			}
		}
		return tempArray;
	}

	public static int[][] subsets(int input[], int index) {

		if (input.length == index) {
			return new int[1][1];
		}
		int[][] smallAns = subsets(input, ++index);
		int smallAnsRow = smallAns.length;
		int number = input[index - 1];
		int[][] newArr = new int[smallAnsRow * 2][];
		for (int i = 0; i < smallAnsRow; i++) {
			newArr[i] = new int[smallAns[i].length];
		}
		for (int j = 0; j < smallAnsRow; j++) {
			newArr[smallAnsRow + j] = new int[smallAns[j].length + 1];
		}
		for (int i1 = 0; i1 < smallAns.length; i1++) {
			for (int j = 0; j < smallAns[i1].length; j++) {
				newArr[i1][j] = smallAns[i1][j];
			}
		}
		for (int i = 0; i < smallAnsRow; i++) {
			for (int j = 0; j < smallAns[i].length; j++) {
				if (j == 0) {
					newArr[smallAnsRow + i][j] = number;

				} else
					newArr[smallAnsRow + i][j] = smallAns[i][j - 1];
			}
		}
		return newArr;
	}

	static int arr[][] = new int[0][];
	static int index = 0;

	/**
	 * Given an array A of size n and an integer K, return all subsets of A
	 * which sum to K. Subsets are of length varying from 0 to n, that contain
	 * elements of the array. But the order of elements should remain same as in
	 * the input array. Note : The order of subsets are not important. Input
	 * format :
	 * 
	 * 
	 * @param input
	 * @param k
	 * @return
	 */
	public static int[][] subsetsSumK(int input[], int k) {
		int[] vfr = new int[0];
		return subsetsSumK(input, k, 0, vfr);
	}

	public static int[][] subsetsSumK(int input[], int k, int index, int[] asdf) {
		if (input.length == index) {
			if (asdf.length > 0 && k == 0) {
				addValueToFinalSolution(asdf);
			}
			return new int[0][0];
		}
		index = index + 1;
		subsetsSumK(input, k, index, asdf);
		asdf = restructure(asdf, input[index - 1]);
		subsetsSumK(input, k - input[index - 1], index, asdf);
		return arr;
	}

	public static int[] restructure(int[] arr1, int number) {
		int temp[] = arr1;
		arr1 = new int[arr1.length + 1];
		for (int i = 0; i < temp.length; i++) {
			arr1[i] = temp[i];
		}
		int indexValueToBeAdded = arr1.length - 1;
		arr1[indexValueToBeAdded] = number;
		return arr1;
	}

	public static void addValueToFinalSolution(int[] valueTobeAdded) {
		int[][] qwer = arr;
		index = index + 1;
		arr = new int[index][];
		for (int i = 0; i < qwer.length; i++) {
			arr[i] = new int[qwer[i].length];
			for (int j = 0; j < qwer[i].length; j++) {
				arr[i][j] = qwer[i][j];
			}
		}
		arr[index - 1] = new int[valueTobeAdded.length];
		for (int k = 0; k < valueTobeAdded.length; k++) {
			arr[index - 1][k] = valueTobeAdded[k];
		}
	}

	/**
	 * Given an array A and an integer K, print all subsets of A which sum to K.
	 * Subsets are of length varying from 0 to n, that contain elements of the
	 * array. But the order of elements should remain same as in the input
	 * array. Note : The order of subsets are not important. Just print them in
	 * different lines. Input format :
	 * 
	 * @param input
	 * @param k
	 */
	public static void printSubsetsSumTok(int input[], int k) {
		printSubsetsSumTok(input, 0, k, new int[0]);
	}

	public static void printSubsetsSumTok(int[] input, int index, int k, int arr[]) {

		if (input.length == index) {
			if (k == 0) {
				for (int i : arr) {
					System.out.print(i + " ");
				}
				System.out.println("");
				return;
			}
			return;
		}
		index = index + 1;
		printSubsetsSumTok(input, index, k, arr);
		arr = refactor(arr, input[index - 1]);
		printSubsetsSumTok(input, index, k - input[index - 1], arr);

	}

	public static int[] refactor(int[] arr, int index) {
		int[] temp = arr;
		arr = new int[arr.length + 1];
		for (int i = 0; i < temp.length; i++)
			arr[i] = temp[i];
		arr[temp.length] = index;
		return arr;
	}
	
	
	/**
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 **/

}
