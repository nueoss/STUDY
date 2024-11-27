package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QuickSort {
	public static void main(String[] args) throws IOException {

		/* 백준 11004번 K번째 수 구하기 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(line1.nextToken()); // 크기
		int k = Integer.parseInt(line1.nextToken()); // 크기
		
		int [] nums = new int[size];
		
		StringTokenizer line2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			nums[i] = Integer.parseInt(line2.nextToken()); // 크기
		}
		
		Arrays.sort(nums);
		
		System.out.println(nums[k]);
 	}
}
