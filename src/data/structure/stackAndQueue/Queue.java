package data.structure.stackAndQueue;

import data.structure.LinkedList.LinkedListNode;

public class Queue<T> {
	
    LinkedListNode<T> head;
    LinkedListNode<T> tail;
    T data;
    int size;


	public Queue() {
        head = null;
        tail= null;
        size=0;
	}
	public int getSize() { 
	return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return (head==null);
    }


    public void enqueue(T data) {
    	//Implement the enqueue(element) function
        LinkedListNode<T> tl  =  new LinkedListNode<T>(data);
        size++;
        if(head==null){
            head = tl;
            tail = tl;
        }
        else{
            tail.next  =  tl;
            tail=tail.next;
        }
    }


    public T dequeue() throws QueryEmptyException {
    	//Implement the dequeue() function
        if(head==null){
            throw new QueryEmptyException();
        }
        size--;
        T data = head.data;
        head = head.next;
        return data;
    }


    public T front() {
        if(head==null){
            throw new QueryEmptyException();
        }
        return head.data;
    }
}
