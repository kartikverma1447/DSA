package com.data.structure.hash.map;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyNumber {

	public static int maxFrequencyNumber(int[] arr) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read
		 * input, it is passed as function argument. Return output and don't
		 * print it. Taking input and printing output is handled automatically.
		 */
		HashMap<Integer, Integer> setValue = new HashMap<Integer, Integer>();
		for (int a : arr) {
			if (!setValue.containsKey(a)) {
				setValue.put(a, 1);
			} else {
				setValue.put(a, setValue.get(a) + 1);
			}
		}
		int max = 0;
        int value = -1;
		for (int a : arr) {
			if (max <  setValue.get(a)){
				value = a;
            	max = setValue.get(a);
		}}
		return value;

	}
}
