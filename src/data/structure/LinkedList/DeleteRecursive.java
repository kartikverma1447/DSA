package data.structure.LinkedList;

public class DeleteRecursive {

	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
		if (pos == 0) {
			if (head == null)
				return head;
			else
				return head.next;
		}
		if (head == null) {
			return head;
		}
		head.next = deleteNodeRec(head.next, pos - 1);
		return head;
	}

}