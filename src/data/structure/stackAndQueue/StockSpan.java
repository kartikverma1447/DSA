package data.structure.stackAndQueue;

import java.util.Stack;

public class StockSpan {

	/**
	 * Afzal has been working with an organization called 'Money Traders' for
	 * the past few years. The organization is into the money trading business.
	 * His manager assigned him a task. For a given array/list of stock's prices
	 * for N days, find the stock's span for each day. The span of the stock's
	 * price today is defined as the maximum number of consecutive days(starting
	 * from today and going backwards) for which the price of the stock was less
	 * than today's price. For example, if the price of a stock over a period of
	 * 7 days are [100, 80, 60, 70, 60, 75, 85], then the stock spans will be
	 * [1, 1, 1, 2, 1, 4, 6].
	 * 
	 * @param price
	 * @return
	 */
	public static int[] stockSpan(int[] price) {

		Stack<Integer> stack = new Stack<Integer>();
		int[] arr = new int[price.length];
		for (int i = 0; i < price.length; i++) {
			if (i == 0) {
				stack.push(i);
				arr[i] = 1;
			} else if (price[i] >= price[stack.peek()]) {
				while (!stack.isEmpty()) {
					if (price[i] <= price[stack.peek()])
						break;
					stack.pop();
				}
				if (stack.isEmpty())
					arr[i] = i + 1;
				else
					arr[i] = i - stack.peek();
				stack.push(i);
			} else {
				arr[i] = i - stack.peek();
				stack.push(i);
			}
		}

		return arr;
	}

}
