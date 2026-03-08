package At2026_Book;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Question4 {

	public static void main(String[] args) {
		int[] iArr = {1, 2, 3, 1, 2};
		System.out.println(solution(iArr, 3));
	}

	public static int solution(int [] iArr, int M) {
		
		// 1. 구간합 구하기
		int[] iSumArr = new int[iArr.length + 1];
		for(int i = 1; i <= iArr.length; i++) {
			iSumArr[i] = iSumArr[i - 1] + iArr[i - 1];
		}
		
		// 2. 나머지 합 구하기
		int[] iModArr = new int[iSumArr.length];
		for(int i = 1; i <= iArr.length; i++) {
			iModArr[i] = iSumArr[i] % M;
		}
		
		// 3. 경우의 수 구하기
		// (1) 나머지가 0인 경우 더하기
		// (2) 나머지 같은 경우 구하기
		
		int iCnt = 0;
		HashMap<Integer, Integer> oNum = new HashMap<Integer, Integer>();
		for(int i = 1; i < iModArr.length; i++) {
			if(oNum.get(iModArr[i]) == null)
				oNum.put(iModArr[i], 1);
			else 
			{
				int N= oNum.get(iModArr[i]);
				oNum.put(iModArr[i], N + 1);
			}
			
			if(iModArr[i] == 0)
				iCnt++;
		}
		
		// (3) 경우의 수 더하기
		for(int iMod : oNum.values()) {
			iCnt += iMod * (iMod - 1) / 2;
		}
		
		return iCnt;
	}
}
