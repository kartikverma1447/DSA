package data.structure.LinkedList;

public class print {
	
	
	public void print(LinkedListNode<Integer> list) {
		LinkedListNode<Integer> temp = list;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
