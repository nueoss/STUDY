package At2026_Programmars;

import java.util.ArrayList;
import java.util.List;

public class Lv2_Q5 {

	public static void main(String[] args) {
		System.out.println(solution(15));
	}
	
	public static int solution(int n) {
		
		int [] iArr = new int[n];
		for(int i = 1; i <= n; i++) {
			iArr[i - 1] = i;
		}
		
		int iCnt = 0;
		for(int i = 0; i < iArr.length; i++) {
			int iNum = iArr[i];
			int iSum = 0;

			for(int j = iNum; j <= n; j++) {
				iSum += j;
				
				if(iSum > 15)
					break;
				else if (iSum == 15) {
					iCnt++;
					break;
				}
			}
		}
		
		return iCnt;
	}

}
