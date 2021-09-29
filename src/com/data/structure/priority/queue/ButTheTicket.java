package com.data.structure.priority.queue;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.LinkedList;

class MaxPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 < o2){
			return 1;
		}else if(o1 > o2){
			return -1;
		}
		return 0;
	}

}


public class ButTheTicket {
	
	
	public static int buyTicket(int input[], int k) {
		int timeTaken = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		MaxPQComparator comparator = new MaxPQComparator();
		PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
		for(int i = 0; i<input.length;i++){
			queue.add(i);
			pq.add(input[i]);
		}
		while(!pq.isEmpty() ){

			if(input[queue.peek()]!=pq.peek()){
				queue.add(queue.peek());
                queue.poll();
			}else if(input[queue.peek()]==pq.peek() && queue.peek()==k){
				return timeTaken+1;
			}else{
				pq.remove();
                queue.poll();
				timeTaken++;
			}
		}
		return timeTaken;
	}
}
    
  