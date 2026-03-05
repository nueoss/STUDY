package At2026_Programmars;

public class Lv2_Q2 {

	public static void main(String[] args) {
		
		// 프로그래머스 Lv2 JadenCase
		System.out.print(solution("3people unFollowed me"));
	}

	public static String solution(String s) {
		
		String[] sArr = s.split(" ");
		
		StringBuilder oResult = new StringBuilder(); 
		for(int i = 0; i < sArr.length; i++) {
			
			String sWord = "";
			char [] cArr = sArr[i].toCharArray();
			for(int j = 0; j < sArr[i].length(); j++) {
				
				if(j == 0 && cArr[j] >= 'a' && cArr[j] <= 'z')
					cArr[j] -= 32;
				else if (cArr[j] >= 'A' && cArr[j] <= 'Z')
					cArr[j] += 32;
				
				sWord += cArr[j]; 
			}
			
			oResult.append(sWord);
			
			if(i != sArr.length - 1)
				oResult.append(" ");
		}
		
		return oResult.toString();
	}
}
