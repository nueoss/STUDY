package At2026_Book;

public class Question2 {

	public static void main(String[] args) {
		int[] iQArr = {5, 3};
		int[] iTarget = {5, 4, 3, 2, 1};
		int[] iQ1 = {1, 3};
		int[] iQ2 = {2, 4};
		int[] iQ3 = {5, 5};

		System.out.println(solution(iQArr, iTarget, iQ3));
	}
	
	private static int solution(int[] pQrr, int[] pTarget, int[] Q1) {
		int[] iSumArr = new int[pQrr[0] + 1];
		iSumArr[0] = 0;
		
		for(int i = 1; i < iSumArr.length; i++) {
			iSumArr[i] = iSumArr[i - 1] + pTarget[i - 1]; 
		}
		
		return iSumArr[Q1[1]] - iSumArr[Q1[0] - 1];
		
	}

}
