package At2026_Programmars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lv2_Q4 {

	public static void main(String[] args) {
			
		int[] A = {1,2};
		int[] B = {3, 4};
		
		System.out.println(solution(A, B));
	}
	
	public static int solution(int[] A, int [] B) {
		
		int iSum = 0;
		
		// 1. 정렬
		Arrays.sort(A);
		Arrays.sort(B);
		
		List<Integer> lTemp = new ArrayList<Integer>();
		for(int i : B) {
			lTemp.add(i);
		}
		
		Collections.reverse(lTemp);
		
		// 2. 곱하기
		for(int i = 0; i < A.length; i++) {
			iSum = iSum + (A[i] * lTemp.get(i));
		}
		
		return iSum;
	}

}
