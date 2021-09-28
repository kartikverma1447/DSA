package data.structure.LinkedList;

public class BubbleSort {

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        for(int i=0;i<size;i++){
           LinkedListNode<Integer> currentNode = head;
        	LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> next = currentNode.next;
            while(currentNode.next!=null){
                if(currentNode.data<currentNode.next.data){
                    prev = currentNode;
                    currentNode=next;
                    next = next.next;
                }else{
                    if(currentNode==head){
                        currentNode.next = next.next;
                        next.next = currentNode;
                        head = next;
                        prev = next;
                        next = currentNode.next;
                        
                    }else{
                        prev.next = currentNode.next;
                        currentNode.next = next.next;
                        next.next = currentNode;
                        prev=prev.next;
                        next = currentNode.next;
                    }
                }
            }
        }
        
        return head;
	}
}