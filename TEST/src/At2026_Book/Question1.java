package At2026_Book;

public class Question1 {

	public static void main(String[] args) {
		// 백준 1546번
		
		int [] iArr = {1, 100, 100, 100};
		System.out.print(Calculate(4, iArr));
		
	}
	
	public static double Calculate(int pNum, int[] pScore) {
	
		// 1. Max 구하기
		int max = 0;
		for(int i = 0; i < pNum; i++) {
			max = Math.max(max, pScore[i]);
		}
		
		// 2. 평균값 구하기
		double dTotalScore = 0;
		for(int i = 0; i < pNum; i++) {
			dTotalScore += (double) pScore[i] / max * 100;
		}
		
		return dTotalScore / pNum;
	}
	

}
