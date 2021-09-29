package com.data.structure.priority.queue;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class KLargestElement {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		
        PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < input.length; i++){
            pq.add(input[i]);
        }
        for(int i=0;i<input.length-k;i++){
            pq.remove();
        }
        while(!pq.isEmpty()){
            arr.add(pq.remove());
        }
            
        return arr;
		
	}
}