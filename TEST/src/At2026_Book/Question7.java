package At2026_Book;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
		
		int[] iNums = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(solution(iNums));
	}
	
	public static int solution(int [] pNums) {
		
		int iStartIDX = 0;
		int iEndIDX = 1;
		int iCnt = 0;

		// 1. 포함 여부를 위해 List 변환
		List<Integer> oNumList = new ArrayList();
		for(int i : pNums)
			oNumList.add(i);
		
		while(iEndIDX != pNums.length - 2) {
			int iTempSum = pNums[iStartIDX] + pNums[iEndIDX];
			if(oNumList.contains(iTempSum)) {
				iCnt++;
				iEndIDX++;
				iStartIDX++;
			} 
		}
		
		return 0;
	}

}
