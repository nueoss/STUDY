package retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(line1.nextToken());
		int q = Integer.parseInt(line1.nextToken());
		
		StringTokenizer line2 = new StringTokenizer(br.readLine());
		int [] nums = new int[n + 1];
		int [] sNum = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			nums[i] = Integer.parseInt(line2.nextToken());
			sNum[i] = sNum[i-1] + nums[i]; // 부분 합
		}
		
		for(int i = 0; i < q; i++) {
			StringTokenizer line3 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(line3.nextToken());
			int b = Integer.parseInt(line3.nextToken());
			
			System.out.println(sNum[b] - sNum[a-1]);
		}
		
		
		
		
	}
}
