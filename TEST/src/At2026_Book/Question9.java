package At2026_Book;

import java.util.Deque;
import java.util.LinkedList;

public class Question9 {

	public static void main(String[] args) {

		int[] iVal = {1, 5, 2, 3, 6, 2, 3, 7, 3, 5, 2, 6};
		System.out.println(solution(3, iVal));
	}
	
	static String solution(int pCnt, int[] pVal) {
		
		String sResult = "";
		
		//. 정렬을 위한 덱 만들기
		Deque<Node> oDeque = new LinkedList<>();
		for(int i = 0; i < pVal.length; i++) {
			int iNow = pVal[i];
			
			// 마지막 값이 현재값보다 크면 제거
			while(!oDeque.isEmpty() && oDeque.getLast().iVal > iNow)
				oDeque.removeLast();
			
			// 추가
			oDeque.addLast(new Node(i, iNow));
			
			// N번째가 지났으면 앞에거 제거
			if(!oDeque.isEmpty() && oDeque.getFirst().iIndex <= i - pCnt)
			    oDeque.removeFirst();

			sResult += oDeque.getFirst().iVal + " ";
		}
		
		return sResult;
	}
	
	static class Node {
		int iIndex;
		int iVal;
		
		Node(int pIndex, int pVal){
			this.iIndex = pIndex;
			this.iVal = pVal;
		}
		
	}

}
