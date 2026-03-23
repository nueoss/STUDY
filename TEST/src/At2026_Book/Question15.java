package At2026_Book;

public class Question15 {

	public static void main(String[] args) {

		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}
	
	static void DFS(int pNum, int pLength) {
		
		// 자릿수가 4일 경우
		if(pLength == 4)
		{
			if(IsPrime(pNum))
				System.out.println(pNum);
			
			return;
		}
		
		// 1 ~ 9까지 pNum에 추가
		for(int i = 1; i <= 9; i++) {
			if(i % 2 == 0) continue; // 짝수면 X
			
			if(IsPrime(pNum * 10 + i))
				DFS(pNum * 10 + i, pLength + 1);
		}
		
	}
	
	static boolean IsPrime(int pNum) {
		for(int i = 2; i * i <= pNum; i++) {
			if (pNum % 2 == 0) 
				return false;
		}
		
		return true;
	}

}
