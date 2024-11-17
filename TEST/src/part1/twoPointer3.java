package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class twoPointer3 {
	public static void main(String[] args) throws IOException {

		/* 백준 1253번 좋은 수 구하기 */
		
		// 1. 변수 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer line = new StringTokenizer(br.readLine());
		int [] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(line.nextToken());
		}
		
		int count = 0;
		
		// 2. 정렬
		Arrays.sort(nums);
		
		// 3. 계산
		
		for(int i = 0; i < n; i++) {
			
			int start = 0; // 값을 찾기 위해서 다시 처음부터 시작해야 하니 while문 밖에 선언
			int end = n-1;
			int find = nums[i]; // 찾을 값
			
			while(start < end) {
				
				if (start == i) {
					start++;
					continue;
				}
				if (end == i) {
					end--;
					continue;
				}
				
				int nSum = nums[start] + nums[end];
				
				if (nSum == find) {
	                    count++;
	                    break; // 좋은 수를 찾았으니 다음 i로 넘어감
                } else if (nSum < find) {
                    start++;
                } else {
                    end--;
                }
			}
		
		}
		
		System.out.println(count);
	}
}

