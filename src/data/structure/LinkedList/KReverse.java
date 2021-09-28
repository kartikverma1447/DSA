package data.structure.LinkedList;


public class KReverse {
    
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        
        if(head==null|| head.next==null){
            return head;
        }
        if(k==0){
            return head;
        }
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        LinkedListNode<Integer> prev = null; 
        int count =0;
        while(count<k && current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next!=null){
            head.next = kReverse(next,k);
        }
        return prev;
    }

}