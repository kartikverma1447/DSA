package data.structure.LinkedList;

public class FindNodeRecursive {

	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
		return findNodeRec(head,n,0);    
        
	}
    public static int findNodeRec(LinkedListNode<Integer> head,int n,int pos){
        if(head==null){
            return -1;
        }
        if(head.data==(n)){
            return pos;
        }
        int number = findNodeRec(head.next,n,++pos);
        return number;
    }

}