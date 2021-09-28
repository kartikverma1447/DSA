package data.structure.stackAndQueue;

import data.structure.LinkedList.LinkedListNode;

public class Stack {
	


    private  LinkedListNode<Integer> head;
    private int size;


    public Stack() {
        head = null;
        size =0;
    }


    public int getSize() { 
        return size;
    }

    public boolean isEmpty() {
       return (head==null);
        
    }

    public void push(int element) {
 
             LinkedListNode<Integer> ln = new  LinkedListNode<>(element);
			ln.next = head;
            head = ln;
        size++;
    }

    public int pop() {
        if(head==null){
            return -1;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
        
    }
    

    public int top() {
        if(head==null){
            return -1;
        }
        else
        return head.data;
    }

}
