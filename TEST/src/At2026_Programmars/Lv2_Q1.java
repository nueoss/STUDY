package At2026_Programmars;

public class Lv2_Q1 {

	public static void main(String[] args) {
		
		// 프로그래머스 LV2 최댓값과 최솟값
		System.out.print(solution("-1 -2 -3 -4"));
	}
	
	public static String solution(String s) {
		
		String[] sArr = s.split(" ");
		
		int iMax = -999999;
		int iMin = 9999999;
		for(int i = 0; i < sArr.length; i++) {
			iMax = Math.max(iMax, Integer.parseInt(sArr[i]));
			iMin = Math.min(iMin, Integer.parseInt(sArr[i]));
		}
		
		return String.format("%s %s", iMin + "", iMax + "");
	}

}
