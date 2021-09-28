package data.structure.LinkedList;

public class NextNumber {

	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {

		if (head == null) {
			return head;
		}
		if (head.next == null) {
			LinkedListNode<Integer> lm = new LinkedListNode<Integer>(head.data + 1);
			return lm;
		}
		LinkedListNode<Integer> temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		if (temp.next.data != 9) {
			LinkedListNode<Integer> lm = new LinkedListNode<Integer>(temp.next.data + 1);
			temp.next = lm;
		} else {
			int carry = addWithCarry(head);
			if (carry > 0) {
				LinkedListNode<Integer> newNode = newNode(carry);
				newNode.next = head;
				return newNode; // New node becomes head now
			}

		}
		return head;
	}

	static int addWithCarry(LinkedListNode<Integer> head) {
		if (head == null)
			return 1;
		int res = head.data + addWithCarry(head.next);
		head.data = (res) % 10;
		return (res) / 10;
	}

	static LinkedListNode<Integer> newNode(int data) {
		LinkedListNode<Integer> new_node = new LinkedListNode<Integer>(data);
		new_node.data = data;
		new_node.next = null;
		return new_node;
	}

}
