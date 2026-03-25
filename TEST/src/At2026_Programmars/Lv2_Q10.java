package At2026_Programmars;

public class Lv2_Q10 {

	public static void main(String[] args) {

		int [] iArr = {7,9,1,1,4};
		System.out.println(solution(iArr));
	}
	
	static int solution(int [] elements) {
		
		int[] prefix = new int[elements.length * 2 + 1];
		
		for(int i = 0; i < prefix.length; i++) {
			prefix[i + 1] = prefix[i]+ elements[i % 2];
		}
		
		
		
		return 0;
		
	}

}
