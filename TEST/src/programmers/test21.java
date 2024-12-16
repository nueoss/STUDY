package programmers;

import java.util.Stack;

public class test21 {

	public static void main(String[] args) {
		
			int [] arr = new int[] {1, 1, 3, 3, 0, 1, 1};
			
		 	Stack<Integer> stack = new Stack<>();
	        
	        for(int i : arr) {
	            if(stack.isEmpty() || stack.peek() != i) stack.push(i);
	        }
	        
	        
	        int[] answer = new int[stack.size()];
	        
	        for(int i = stack.size() - 1 ; i >= 0; i--) {
	            answer[i] = stack.pop();
	        }
	        

	}

}
