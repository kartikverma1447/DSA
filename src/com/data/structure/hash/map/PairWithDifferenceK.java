package com.data.structure.hash.map;

import java.util.*;

public class PairWithDifferenceK {

    public static int getPairsWithDifferenceK(int[] input, int k) {
        int ans=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : input) {
            if (map.containsKey(j - k) && k != 0) {
                ans+=map.get(j-k);

            }
            if (map.containsKey(j + k)) {
                ans+=map.get(j+k);

            }
            map.putIfAbsent(j,0);
            map.put(j,map.get(j)+1);

        }
        return ans;
    }
}