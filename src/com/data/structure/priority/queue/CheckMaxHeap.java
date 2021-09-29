package com.data.structure.priority.queue;
public class CheckMaxHeap {

	public static boolean checkMaxHeap(int arr[]) {
		if(arr.length==0){
            return true;
        }
        
        int prevValue = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=prevValue){
                prevValue = arr[i];
            }else{
                return false;
            }
        }
        return true;
	}
}