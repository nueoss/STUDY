package At2026_Programmars;

import java.util.Queue;

public class Lv2_Q3 {

	public static void main(String[] args) {
		
		System.out.println(solution("()()"));

	}
	
	public static Boolean solution(String s) {
		
		int iCnt = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(')
				iCnt++;
			else
				iCnt--;
			
			if(iCnt < 0)
				return false;
		}
	
		return iCnt == 0;
	}

}
