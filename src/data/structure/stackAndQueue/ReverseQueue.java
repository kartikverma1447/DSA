package data.structure.stackAndQueue;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

	public static void reverseQueue(Queue<Integer> input) {
          if(input.size()<=1){
	            return;
	        }
	        int data = input.peek();
	        input.poll();
	        
	        
	        reverseQueue(input);
	        
	        input.add(data);
	}

}