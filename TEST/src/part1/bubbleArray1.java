package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bubbleArray1 {
	public static void main(String[] args) throws IOException {

		/* 백준 2750번 수 정렬하기1 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		int[] nums = new int[count];
		
		for(int i = 0; i < count; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		
		}
		
		// 방법 1 sort() 사용
		/* Arrays.sort(nums); */
		
		// 방법 2 버블 정렬
		for(int i = 0; i < count - 1; i++) {
			for(int j = 0; j < count - 1; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		
		for(int i = 0; i < count; i++) {
			System.out.println(nums[i]);
		}
				
	}
}
