package com.data.structure.hash.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Miscelleneous {

	/**
	 * You are given an array of unique integers that contain numbers in random
	 * order. You have to find the longest possible sequence of consecutive
	 * numbers using the numbers from given array. You need to return the output
	 * array which contains starting and ending element. If the length of the
	 * longest possible sequence is one, then the output array must contain only
	 * single element.
	 * 
	 * @param arr
	 * @return
	 */
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		HashMap<Integer, Boolean> valueSet = new HashMap<Integer, Boolean>();
		for (int v : arr) {
			valueSet.put(v, true);
		}
		int maxSize = 0;
		int finalStart = Integer.MIN_VALUE;
		for (int v : arr) {
			int count = 0;
			int startValue = 0;
			if (valueSet.get(v) == false)
				continue;
			else {
				valueSet.put(v, false);
				startValue = v;
				count++;
				int valueToBeChecked = v;
				while (valueSet.containsKey(++valueToBeChecked)) {
					valueSet.put(valueToBeChecked, false);
					count++;
				}
				valueToBeChecked = v;
				while (valueSet.containsKey(--valueToBeChecked)) {
					valueSet.put(valueToBeChecked, false);
					count++;
					startValue = valueToBeChecked;
				}
				if (count == maxSize && findIndex(arr, finalStart) > findIndex(arr, startValue)) {
					maxSize = count;
					finalStart = startValue;
				} else if (count > maxSize) {
					maxSize = count;
					finalStart = startValue;
				}
			}

		}
		ArrayList<Integer> asdf = new ArrayList<Integer>();
		asdf.add(finalStart);
		if (maxSize != 1)
			asdf.add(finalStart + maxSize - 1);
		return asdf;
	}

	public static int findIndex(int arr[], int t) {
		int len = arr.length;
		return IntStream.range(0, len).filter(i -> t == arr[i]).findFirst() // first
																			// occurrence
				.orElse(Integer.MAX_VALUE); // No element found
	}
}