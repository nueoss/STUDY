package At2026_Book;

public class Question5 {

	public static void main(String[] args) {
		
		System.out.println(solution(15));

	}
	
	public static int solution(int N) {
		
		int iStartIDX = 1;
		int iEndIDX = 1;
		int iSum = 1;
		int iCnt = 1;
		while (iEndIDX != N) {
			if(iSum > N){
				iSum -= iStartIDX;
				iStartIDX++;
			} else if (iSum < N) {
				iEndIDX++;
				iSum += iEndIDX;
			} else if (iSum == N) {
				iCnt++;
				iEndIDX++;
				iSum += iEndIDX;
			}
		}
		
		return iCnt;
	}

}
