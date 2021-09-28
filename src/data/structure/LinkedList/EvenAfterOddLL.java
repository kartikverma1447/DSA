package data.structure.LinkedList;

public class EvenAfterOddLL {

	/**
	 * For a given singly linked list of integers, arrange the elements such
	 * that all the even numbers are placed after the odd numbers. The relative
	 * order of the odd and even terms should remain unchanged.
	 * 
	 * @param head
	 * @return
	 */
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> evenNode = null;
		LinkedListNode<Integer> evenNodeTail = null;
		LinkedListNode<Integer> oddNode = null;
		LinkedListNode<Integer> oddNodeTail = null;
		while (head != null) {
			if (head.data % 2 == 0) {
				if (evenNode == null) {
					evenNode = new LinkedListNode<Integer>(head.data);
					evenNodeTail = evenNode;
				} else {
					evenNodeTail.next = head;
					evenNodeTail = evenNodeTail.next;
				}
			} else {
				if (oddNode == null) {
					oddNode = new LinkedListNode<Integer>(head.data);
					oddNodeTail = oddNode;
				} else {
					oddNodeTail.next = head;
					oddNodeTail = oddNodeTail.next;
				}
			}
			head = head.next;
		}
		if (oddNodeTail == null) {
			return evenNode;
		}

		oddNodeTail.next = evenNode;
		if (evenNodeTail != null) {
			evenNodeTail.next = null;

		}
		return oddNode;

	}
}