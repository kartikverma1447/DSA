package data.structure.stackAndQueue;

public class ReverseStack {
	
	
	public static void reverseString(Stack input,Stack extra) {

		if(input.getSize()<=1){
			return;
		}
		int lastElement = input.pop();
		reverseString(input, extra);
		
		while(!input.isEmpty()){
			int top = input.pop();
			extra.push(top);
		}
		
		input.push(lastElement);
		while(extra.isEmpty()){
			input.push(extra.pop());
		}
	}

}
