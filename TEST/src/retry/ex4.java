package retry;

import java.io.IOException;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int start = 1;
		int end = 1;
		int sum = 1; 
		int count = 1;
		
		while(end != n) {
			if(sum < n) {
				end++;
				sum += end;
			} else if (sum > n) {
				sum -= start;
				start++;
			} else {
				end++;
				sum += end;
				count++;
			}
		}
		
		System.out.println(count);
	}
}
