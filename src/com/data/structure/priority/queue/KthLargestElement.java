package com.data.structure.priority.queue;
import java.util.PriorityQueue;
public class KthLargestElement {

	public static int kthLargest(int n, int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
				pq.poll();
                pq.add(arr[i]);            
            }
        }
        return pq.poll();
	}
    
}