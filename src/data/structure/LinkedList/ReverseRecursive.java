package data.structure.LinkedList;
public class ReverseRecursive {

	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null||head.next==null){
            return head;
        }
        LinkedListNode<Integer> temp = head.next;
        LinkedListNode<Integer> finalHead = reverseLinkedListRec(head.next);
        temp.next = head;
        head.next = null;
        return finalHead;
	}

}