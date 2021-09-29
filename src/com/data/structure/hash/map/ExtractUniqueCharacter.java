package com.data.structure.hash.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExtractUniqueCharacter {

	public static String uniqueChar(String str) {
		
		HashMap<Character, Integer> set = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for (char a : arr) {
			if (!set.containsKey(a)) {
				set.put(a, 1);
			}
             else{
                set.put(a,set.get(a)+1);
             }
		}
        System.out.println(set);
		String finalString = "";
		for (char a : arr) {
			if (set.get(a) != 0) {
				finalString+=String.valueOf(a);
				set.put(a,0);
			}
		}
		return finalString;
	}
}