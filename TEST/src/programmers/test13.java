package programmers;

import java.util.Arrays;
import java.util.Collections;

public class test13 {
	public static void main(String[] args) {
		
		int k = 4;
		int m = 3;
		int[] score = new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}; 

		Integer[] arr = new Integer[score.length];
        
		for (int i = 0; i < score.length; i++) {
            arr[i] = score[i];  // 각 요소를 복사
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        int sum = 0;
        
        for(int i = 1; i <= (score.length / m); i++) {
            sum += arr[i * m - 1] * m;
        }
        
    }
}