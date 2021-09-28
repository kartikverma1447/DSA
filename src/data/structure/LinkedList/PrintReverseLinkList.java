package data.structure.LinkedList;

public class PrintReverseLinkList {

	public static void printReverse(LinkedListNode<Integer> root) {

		LinkedListNode prev = null;
		LinkedListNode next = null;
		LinkedListNode current = root;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
	}

}