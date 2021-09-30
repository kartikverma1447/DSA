import java.util.Map;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],false);
        }
       int maxCount =0;
       int currentCOunt=0;
        for(int i=0;i<arr.length;i++){
            value =arr[i];
            map.put(value,true);
            currentCOunt++;
            if(!map.get(arr[i])){
            //checkForLargeOne
                while(map.containsKey(value++)){
                    currentCOunt++;
            //chekForSmallOne
                }while(map.containsKey(value--)){
                    currentCOunt--;
                }
            }
            if(maxCount<currentCOunt){
                maxCount=currentCOunt;
            }currentCOunt=0;
        }
    }
}