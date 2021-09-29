package com.data.structure.hash.map;
import java.util.HashMap;
public class PrintRefactor {

	public static void printIntersection(int[] arr1,int[] arr2){

        HashMap<Integer,Integer> values = new HashMap<Integer,Integer>();
		for(int a1 : arr1){
            if(!values.containsKey(a1))
            values.put(a1,1);
            else{
                values.put(a1,values.get(a1)+1);
            }
        }
        for(int a2 : arr2){
            if(values.containsKey(a2) && values.get(a2)>0){
                System.out.println(a2);
                values.put(a2,values.get(a2)-1);
            }
        }
	}
}