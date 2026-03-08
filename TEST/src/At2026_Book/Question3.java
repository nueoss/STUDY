package At2026_Book;

public class Question3 {

	public static void main(String[] args) {
		int[][] Line = {{1, 2, 3, 4},{2, 3, 4, 5}, {3, 4, 5, 6},{4, 5, 6, 7}} ;
		int[] Q = {2,2,3,4};
		
		System.out.println(solution(Line, Q));

	}
	
	public static int solution(int[][] Line, int[] Q) {
		
		// 1. 구간합 만들기
		
		int[][] iSumArr = new int[Line.length + 1][Line.length + 1];
	
		for(int i = 1; i <= Line.length; i++) {
			for(int j = 1; j <= Line[0].length; j++) {
				iSumArr[i][j] = iSumArr[i][j - 1] + iSumArr[i - 1][j] - iSumArr[i - 1][j - 1] + Line[i - 1][j - 1];
			}
		}
		
		// 2. 값 구하기
		int x1 = Q[0];
		int x2 = Q[2];
		int y1 = Q[1];
		int y2 = Q[3];
		
		int iResult = iSumArr[x2][y2] - iSumArr[x1 -1][y2] - iSumArr[x2][y1 - 1] + iSumArr[x1 -1][y1 - 1];
		return iResult;
	}

}
