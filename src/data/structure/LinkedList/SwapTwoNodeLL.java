package data.structure.LinkedList;

public class SwapTwoNodeLL {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {

		if (head == null || head.next == null || i == j) {
			return head;
		}
		LinkedListNode<Integer> current = head, prev = null;
		LinkedListNode<Integer> p1 = null;
		LinkedListNode<Integer> p2 = null;
		LinkedListNode<Integer> c1 = null;
		LinkedListNode<Integer> c2 = null;
		int pos = 0;
		while (current != null) {
			if (i == pos) {
				p1 = prev;
				c1 = current;
			}
			if (j == pos) {
				p2 = prev;
				c2 = current;
			}
			prev = current;
			current = current.next;
			pos++;
		}
		if (c1 != null) {
			p1.next = c2;
		} else {
			head = c2;
		}
		if (c2 != null) {
			p2.next = c1;
		} else {
			head = c1;
		}
		LinkedListNode<Integer> currentFirstNode = c2.next;
		c2.next = c1.next;
		c1.next = currentFirstNode;

		return head;

	}
}