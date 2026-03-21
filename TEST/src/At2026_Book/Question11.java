package At2026_Book;

import java.util.Stack;

public class Question11 {

	public static void main(String[] args) {
		
		int[] iArr = {9, 5, 4, 8};
		solution(iArr);

	}
	
	static int[] solution(int[] pIArr) {
		
		int[] iResult = new int[pIArr.length];
		Stack<Integer> oStack = new Stack<>();

		for(int i = 0; i < pIArr.length; i++) {
			
			//1. 스택에 맨 위에 있는 거랑 크기 비교 후 빼기
			while(!oStack.isEmpty() && pIArr[oStack.peek()] < pIArr[i])
				iResult[oStack.pop()] = pIArr[i];
			
			// 2. 스택에 넣기
			oStack.push(i);	
			
		}
		
		while(oStack.size() != 0)
			iResult[oStack.pop()] = -1;
		
		return iResult;
	}

}
