package part1;

import java.util.Arrays;
import java.util.Scanner;

public class selectSort1 {
	public static void main(String[] args) {
		/* 백준 1427번 내림차순으로 자릿수 정렬하기 */
		
		// 1. 입력받아서 나누기
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int [] nums = new int[str.length()];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		
		// 2. 정렬하기
		
		// [방법 1] sort() 사용
		/* Arrays.parallelSort(nums); */
		
		// [방법 2] 삽입정렬 사용
		for(int i = 0; i < nums.length; i++) {
			int max = i;
			
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[j] > nums[max]) {
					max = j;
				}
			}
			
			if(nums[max] > nums[i]) {
				int temp = nums[i];
				nums[i] = nums[max];
				nums[max] = temp;
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
