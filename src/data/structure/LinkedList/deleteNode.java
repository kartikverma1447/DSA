package data.structure.LinkedList;

public class deleteNode {

	public LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		if (head == null) {
			return head;
		}
		if (pos == 0) {
			return head.next;
		}
		int i = 0;
		LinkedListNode<Integer> temp = head;
		while (i < pos - 1 && temp != null) {
			temp = temp.next;
			i++;
		}
		if (temp == null || temp.next == null) {
			return head;
		}
		temp.next = temp.next.next;
		return head;
	}

}
