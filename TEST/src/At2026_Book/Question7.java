package At2026_Book;

import java.util.Arrays;


public class Question7 {

	public static void main(String[] args) {
		
		int[] iNums = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(solution(iNums));
	}
	
	public static int solution(int [] pNums) {
		
		// 정렬
		Arrays.sort(pNums);
		
		int iResult = 0;
		for(int i = 0; i < pNums.length; i++) {
			
			int iFind = pNums[i];
			int iStartIDX = 0;
			int iEndIDX = pNums.length - 1;
			
			while(iStartIDX < iEndIDX) {
				
				// 1) 합이 iFind가 맞는지
				if(pNums[iStartIDX] + pNums[iEndIDX] == iFind) {
					
					if(iStartIDX != i && iEndIDX != i) {
						iResult++;
						break;
					} else if (iStartIDX == i) {
						iStartIDX++;
					} else if (iEndIDX == i) {
						iEndIDX++;
					}
					
				} else if (pNums[iStartIDX] + pNums[iEndIDX] < iFind) { // 타겟갑보다 작으면 iStartIDX ++
					iStartIDX++;
				} else {
					iEndIDX--;
				}
				
			}
		}
		
		
		
		return iResult;
	}

}
