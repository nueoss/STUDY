package retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex7 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer line = new StringTokenizer(br.readLine());
		int [] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(line.nextToken());
		}
		
		Arrays.sort(nums);
		int count = 0;
		
		// 찾을 값을 선정해 두고 할 것.
		for(int i = 0; i < n; i++) {
			int start = 0;
			int end = n-1;
			int find = nums[i];
			
			while(start < end) {
				
				int sum = nums[start] + nums[end];
				
				if(sum == find) {
					if(start != i && end != i) {
						count++;
						break;
					} else if (start == i) {
						start++;
					} else {
						end--;
					}
				} else if (sum > find) end--;
				else {
					start++;
				}
				
				
			}
			
 		}
		
		System.out.println(count);
	}
}
