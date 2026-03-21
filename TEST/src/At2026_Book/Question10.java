package At2026_Book;

import java.util.Stack;

public class Question10 {

	public static void main(String[] args) {
		
		int[] iNums = {4, 3, 6, 8, 7, 5, 2, 1};
		System.out.println(solution(iNums));
	}

	static String solution(int[] pNums) {
		
		String sResult = "";
		
		Stack<Integer> myStack = new Stack<>();
		int iIDX = 1;
		for(int i = 0; i < pNums.length; i++) {
			
			if(iIDX <= pNums[i]) {
				while(iIDX <= pNums[i]) {
					myStack.push(iIDX++);
					sResult += "+ ";
				}
				
				// 마지막 하나 뺴기
				myStack.pop();
				sResult += "- ";
				
			} else {
				if(myStack.isEmpty() || myStack.peek() != pNums[i]) {
				    return "NO";
				}

				myStack.pop();
				sResult += "- ";
					
			}
		}
		
		return sResult;
	}
}
