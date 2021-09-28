package data.structure.LinkedList;

public class PalindromeLinkedList {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if(head==null){
            return true;
        }
        if(head.next==null){
            return true;
        }
		int length = 0;
        LinkedListNode<Integer> temp = head;
        while(head!=null){
            head = head.next;
            length++;
        }
        LinkedListNode<Integer> temp2 = temp;
        for(int i=0;i<length/2-1;i++){
            temp=temp.next;
        }
        while(temp2!=null){
         //   System.out.println(temp2.data);
            temp2 = temp2.next;
        }
               while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
       
        return true;
	}

}