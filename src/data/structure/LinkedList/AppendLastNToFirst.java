package data.structure.LinkedList;

public class AppendLastNToFirst {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		if (head == null || head.next == null) {
			return head;
		}
		if (n == 0) {
			return head;
		}
		LinkedListNode<Integer> temp = head;
		int length = 0;
		while (temp != null) {
			temp = temp.next;
			length++;
		}
		temp = head;
		for (int i = 0; i < length - n - 1; i++) {
			temp = temp.next;
		}
		LinkedListNode<Integer> head2;
		head2 = temp.next;
		temp.next = null;
		LinkedListNode<Integer> temp2 = head2;
		if (temp2 != null) {
			while (temp2.next != null) {	
				temp2 = temp2.next;
			}
		} else
			return head2;
		temp2.next = head;
		return head2;
	}

}