package data.structure.LinkedList;

public class DeleteEveryNthNode {

	/**
	 * You have been given a singly linked list of integers along with two
	 * integers, 'M,' and 'N.' Traverse the linked list such that you retain the
	 * 'M' nodes, then delete the next 'N' nodes. Continue the same until the
	 * end of the linked list. To put it in other words, in the given linked
	 * list, you need to delete N nodes after every M nodes.
	 * 
	 * 
	 * @param head
	 * @param M
	 * @param N
	 * @return
	 */
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		if (head == null || head.next == null) {
			return head;
		}
		if (M == 0) {
			return null;
		}
		int tempN = N;
		int tempM = M - 1;
		LinkedListNode<Integer> temp = head;
		while (temp != null && temp.next != null && temp.next.next != null) {
			if (tempM > 0) {
				temp = temp.next;
				tempM--;
			} else if (tempN > 0) {
				temp.next = temp.next.next;
				tempN--;
			} else {
				tempM = M;
				tempN = N;
			}
		}
		if (tempN != 0) {
			temp.next = null;
		}
		return head;
	}
}