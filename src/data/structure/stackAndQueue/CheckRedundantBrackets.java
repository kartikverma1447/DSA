	package data.structure.stackAndQueue;
import java.util.Stack;
public class CheckRedundantBrackets {

	public static boolean checkRedundantBrackets(String expression) {
        int count =0;
        boolean status=false;
        Stack<Character> stack = new Stack<Character>();
        for(char a : expression.toCharArray()){
            if(a==')'){
                status = false;
                while(stack.peek()!='('){
                    stack.pop();
                    count++;
                }
                stack.pop();     
                if(count==0|| count==1){
                    return true;
                }
                status = false;
                count=0;
            }
            if(status){
                stack.push(a);
            }
            else if(a=='('){
                status = true;
                stack.push(a);
            }
            
        }
        return false;
	}
}