package retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex6 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = Integer.parseInt(br.readLine());
		
		StringTokenizer line = new StringTokenizer(br.readLine());
		int [] m = new int[n];
		
		for(int i = 0; i < n; i++) {
			m[i] = Integer.parseInt(line.nextToken());
		}
		
		Arrays.sort(m);
		
		int start = 0;
		int end = n -1;
		int count = 0;
		
		while (end < start) {
			int mySum = m[start] + m[end];
			if(mySum < sum) start++;
			else if (mySum > sum) end--;
			else {
				count++;
				end--;
				start++;
			}
		}
		
		System.out.println(count);
	}
}
