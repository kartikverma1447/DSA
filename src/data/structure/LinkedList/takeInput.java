package data.structure.LinkedList;

import java.util.Scanner;

public class takeInput {
	
	public static LinkedListNode<Integer> takeInput(){
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num!=-1){
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(num);
			if(head==null){
				head=newNode;
				tail=newNode;
			}else{
				tail.next = newNode;
				tail = newNode;
			}
			num = s.nextInt();
		}
		
		return head;
	}
	public static void main(String[] args) {
		takeInput();
	}

}
