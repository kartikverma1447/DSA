package data.structure.LinkedList;

public class MergeLL {

	public LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1,
			LinkedListNode<Integer> head2) {

		if (head1 == null && head2 == null) {
			return head1;
		}
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		if (head1.data < head2.data) {
			head = head1;
			tail = head1;
			head1 = head1.next;
		} else {
			head = head2;
			tail = head2;
			head2 = head2.next;
		}
		LinkedListNode<Integer> finalList = head;
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				head.next = head1;
				head = head.next;
				tail = tail.next;
				head1 = head1.next;
			} else {
				head.next = head2;
				head = head.next;
				tail = tail.next;
				head2 = head2.next;
			}
		}
		if (head1 == null) {
			head.next = head2;
		} else {
			head.next = head1;
		}

		return finalList;
	}

}