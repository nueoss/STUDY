package At2026_Book;

import java.util.LinkedList;
import java.util.Queue;

public class Question12 {

	public static void main(String[] args) {
		
		System.out.println(solution(6));

	}
	
	static int solution(int n) {
		
		Queue<Integer> oQueue = new LinkedList<Integer>();
		
		// 순서 만들기
		for(int i = 1; i <= n; i++)
			oQueue.add(i);
		
		// 반복
		while(oQueue.size() != 1) {
			oQueue.poll();
			int iAddNum = oQueue.poll();
			oQueue.add(iAddNum);

		}
			
		
		return oQueue.peek();
	}

}
