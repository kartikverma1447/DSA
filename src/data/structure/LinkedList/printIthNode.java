package data.structure.LinkedList;

public class printIthNode {

	public void printIth(LinkedListNode<Integer> head,int i) {

		int count = 1;
		while (head != null) {
			head = head.next;
			count++;
			if (i + 1 == count) {
				System.out.println(head.data);
				break;
			}
		}

	}
}
