package data.structure.LinkedList;

public class EliminateDuplicateInLikedList {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if(head==null){
            return head;
        }
       	LinkedListNode<Integer> t1 = head;
        LinkedListNode<Integer> t2 = head.next;
        while(t2!=null){  
        if(t1.data.equals(t2.data)){
            t2 = t2.next;
        }
        else{
            t1.next = t2;
            t1 = t2;
            t2 = t2.next;
        }
        }
            t1.next = t2;
        
        return head;
	}
    

}