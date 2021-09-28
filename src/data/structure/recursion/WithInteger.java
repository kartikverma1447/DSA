package data.structure.recursion;

import java.util.Arrays;

public class WithInteger {

	/**
	 * find x to the power n (i.e. x^n). Take x and n from the user. You need to
	 * return the answer.
	 * 
	 * @param x=number
	 * @param n=power
	 * @return power
	 */
	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}

	/**
	 * print numbers from 1 to n in increasing order recursively.
	 * 
	 * @param n=number
	 */
	public static void printNumber(int n) {
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		printNumber(n - 1);
		System.out.print(n + " ");
	}

	/**
	 * number of digits present in a number recursively.
	 * 
	 * @param n
	 * @return
	 */
	public static int numberOfDigit(int n) {
		if (n == 0) {
			return 0;
		}
		int smallAns = numberOfDigit(n / 10);
		return smallAns + 1;
	}

	/**
	 * Given two integers M & N, calculate and return their multiplication using
	 * recursion. You can only use subtraction and addition for your
	 * calculation. No other operators are allowed.
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int multiplyTwoIntegers(int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}
		if (n == 1) {
			return m;
		}
		return m + multiplyTwoIntegers(m, --n);

	}

	/**
	 * Given an integer N, count and return the number of zeros that are present
	 * in the given integer using recursion.
	 * 
	 * 
	 * @param input
	 * @return
	 */
	public static int countZerosRec(int input) {
		if (input < 10) {
			if (input == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		if (input % 10 == 0) {
			return 1 + countZerosRec(input / 10);
		}
		return countZerosRec(input / 10);
	}

	/**
	 * Given k, find the geometric sum i.e.
	 * 
	 * @param k
	 * @return
	 */
	public static double findGeometricSum(int k) {
		if (k == 0) {
			return 1;
		}
		return 1 / Math.pow(2, k) + findGeometricSum(k - 1);

	}

	/**
	 * Write a recursive function that returns the sum of the digits of a given
	 * integer.
	 * 
	 * @param input
	 * @return
	 */
	public static int sumOfDigits(int input) {
		if (input == 0) {
			return 0;
		}
		return input % 10 + sumOfDigits(input / 10);
	}

	/**
	 * A child is running up a staircase with N steps, and can hop either 1
	 * step, 2 steps or 3 steps at a time. Implement a method to count how many
	 * possible ways the child can run up to the stairs. You need to return
	 * number of possible ways W.
	 * 
	 * @param n
	 * @return
	 */
	public static int staircase(int n) {
		if (n <= 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		int value = n;
		return staircase(value - 1) + staircase(value - 2) + staircase(value - 3);
	}



	/**
	 * Given an integer sorted array (sorted in increasing order) and an element
	 * x, find the x in given array using binary search. Return the index of x.
	 * 
	 * @param input
	 * @param element
	 * @return
	 */
	public static int binarySearch(int input[], int element) {
		return binarySearch(input, element, 0, input.length - 1);
	}

	/**
	 * Given an integer sorted array (sorted in increasing order) and an element
	 * x, find the x in given array using binary search. Return the index of x.
	 * 
	 * @param input
	 * @param element
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public static int binarySearch(int input[], int element, int startIndex, int endIndex) {

		int midValue = input[(startIndex + endIndex) / 2];
		if (startIndex >= endIndex) {
			return -1;
		}

		if (midValue == element) {
			return (startIndex + endIndex) / 2;
		}
		if (midValue < element) {
			return binarySearch(input, element, (startIndex + endIndex) / 2 + 1, endIndex);
		} else {
			return binarySearch(input, element, startIndex, (startIndex + endIndex) / 2 - 1);
		}
	}

	/**
	 * You have made a smartphone app and want to set its subscription price
	 * such that the profit earned is maximised. There are certain users who
	 * will subscribe to your app only if their budget is greater than or equal
	 * to your price. You will be provided with a list of size N having budgets
	 * of subscribers and you need to return the maximum profit that you can
	 * earn. Lets say you decide that price of your app is Rs. x and there are N
	 * number of subscribers. So maximum profit you can earn is :
	 * 
	 * @param budget
	 * @return
	 */
	public static int maximumProfit(int budget[]) {
		Arrays.sort(budget);
		int maxSum = 0;
		for (int i = 0; i < budget.length; i++) {
			if (maxSum < (budget.length - i) * budget[i]) {
				maxSum = (budget.length - i) * budget[i];
			}
		}
		return maxSum;
	}
	
	
	/**
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 **/

}
