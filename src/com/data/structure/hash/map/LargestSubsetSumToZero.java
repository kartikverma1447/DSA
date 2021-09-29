package com.data.structure.hash.map;
import java.util.HashMap;
public class LargestSubsetSumToZero {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        int sum = 0; 
        int max_len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0)
                max_len = i + 1;
           if (hM.containsKey(sum))
                max_len = Math.max(max_len, i - hM.get(sum));
            else
                hM.put(sum, i);
        }
        return max_len;
	}
}