package At2026_Book;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		
		int [] ingredient = {2, 7, 4, 1, 5, 3};
		System.out.println(solution(9, ingredient));
	}
	
	public static int solution(int pM, int[] pIngredient) {
		
		// 1. 정렬
		Arrays.sort(pIngredient);
		
		// 2. 투포인터
		int iStartIDX = 0;
		int iEndIDX = pIngredient.length - 1;
		int iCnt = 0;
		int iSum = 0;
		
		while (iStartIDX < iEndIDX) {
			iSum = pIngredient[iStartIDX] + pIngredient[iEndIDX];
			if(iSum > pM) 
				iEndIDX--;				
			else if (iSum < pM)
				iStartIDX++;
			else 
			{
				iCnt++;
				iStartIDX++;
				iEndIDX--;
			}
			
		}
		
		
		return iCnt;
	}
}
