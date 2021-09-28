package data.structure.LinkedList;


public class DeleteAlternateNodes {

    public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
        if(head==null || head.next==null){
            return;
        }
       LinkedListNode<Integer> prev = head;
       LinkedListNode<Integer> now = head.next;
 
       while (prev != null && now != null)
       {          
           prev.next = now.next;
           prev = prev.next;
           if (prev != null)
              now = prev.next;
       }
    }
}