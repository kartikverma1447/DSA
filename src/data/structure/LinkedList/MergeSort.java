package data.structure.LinkedList;

public class MergeSort {

	public LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> fast = head;
		LinkedListNode<Integer> slow = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		LinkedListNode<Integer> secondHalf = slow.next;
		slow.next = null;
		LinkedListNode<Integer> result = null;
		LinkedListNode<Integer> secondResult = null;
		LinkedListNode<Integer> finalResult = null;
		result = mergeSort(secondHalf);
		secondResult = mergeSort(head);
		finalResult = merge(result, secondResult);
		return finalResult;
	}

	public LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {

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