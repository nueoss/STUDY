package programmers;

import java.util.Stack;

public class test15 {
	public static void main(String[] args) {

		int[] ingredient = new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1};
		Stack<Integer> stack = new Stack<Integer>();
	        
        int count = 0;
        for(int i : ingredient) {
            stack.push(i);
            
            if(stack.size() >= 4) {
                int size = stack.size();
                if(stack.peek() == 1 && stack.get(size - 2) == 3 && stack.get(size - 3) == 2 && stack.get(size - 4) == 1) {
                    count++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
	        
	    System.out.println(count);
	 }
}