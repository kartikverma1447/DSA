package data.structure.LinkedList;


public class MidPointOfLinkList {
    
    public  LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
    	LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        
        if(head == null || head.next==null){
            return head;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //System.out.println(slow.data);
        return slow;
    }

}