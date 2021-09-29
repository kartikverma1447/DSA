package com.data.structure.hash.map;

import java.util.HashMap;

public class PairSumToZero {
	public static int PairSum(int[] arr, int n) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (!hm.containsKey(arr[i]))
				hm.put(arr[i], 0);
			hm.put(arr[i], hm.get(arr[i]) + 1);
		}
		int twice_count = 0;

		for (int i = 0; i < n; i++) {
			if (hm.get(sum - arr[i]) != null)
				twice_count += hm.get(sum - arr[i]);
			if (sum - arr[i] == arr[i])
				twice_count--;
		}
		return twice_count / 2;
        
	}
}