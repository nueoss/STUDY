package At2026_Book;

import java.util.PriorityQueue;


public class Question13 {

	public static void main(String[] args) {
		int [] iArr = {1, -1, 0 , 0, 0, 1, 1, -1, -1, 2, -2,0, 0, 0, 0, 0, 0, 0};
		solution(iArr);
	}
	
	static void solution(int[] pArr) {
		
		// 우선순위 큐 
		PriorityQueue<Integer> oQueue = new PriorityQueue<>((o1, o2) -> {
			int iFirst = Math.abs(o1);
			int iSecond = Math.abs(o2);
			
			if (iFirst == iSecond)
				return Integer.compare(o1, o2); // 절대값 값이 같으면 큰수가 뒤로
			
			return Integer.compare(iFirst, iSecond); // 다르면 절대값 비교
		});
		
		// 반복
		int [] iResult = new int[pArr.length];
		int iIDX = 0;
		for(int i = 0; i < pArr.length; i++) {
			
			
			if(pArr[i] == 0) 
				iResult[iIDX++] = oQueue.isEmpty() ? 0 : oQueue.poll();
			else 
				oQueue.add(pArr[i]);
				
		}
		
		
	}

}
