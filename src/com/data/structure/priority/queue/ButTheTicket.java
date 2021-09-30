package com.data.structure.priority.queue;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.LinkedList;

class MaxPQComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if (o1 < o2) {
			return 1;
		} else if (o1 > o2) {
			return -1;
		}
		return 0;
	}

}

public class ButTheTicket {

	/**
	 * You want to buy a ticket for a well-known concert which is happening in
	 * your city. But the number of tickets available is limited. Hence the
	 * sponsors of the concert decided to sell tickets to customers based on
	 * some priority. A queue is maintained for buying the tickets and every
	 * person is attached with a priority (an integer, 1 being the lowest
	 * priority). The tickets are sold in the following manner -
	 * 
	 * @param input
	 * @param k
	 * @return
	 */
	public static int buyTicket(int input[], int k) {
		int timeTaken = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		MaxPQComparator comparator = new MaxPQComparator();
		PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
		for (int i = 0; i < input.length; i++) {
			queue.add(i);
			pq.add(input[i]);
		}
		while (!pq.isEmpty()) {

			if (input[queue.peek()] != pq.peek()) {
				queue.add(queue.peek());
				queue.poll();
			} else if (input[queue.peek()] == pq.peek() && queue.peek() == k) {
				return timeTaken + 1;
			} else {
				pq.remove();
				queue.poll();
				timeTaken++;
			}
		}
		return timeTaken;
	}
}
