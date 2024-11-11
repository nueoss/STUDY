package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class twoPointer2 {
	public static void main(String[] args) throws IOException {
		
		/* 백준 1940번 주몽의 명령 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1) 값 초기화
		int n = Integer.parseInt(br.readLine());
		int sum = Integer.parseInt(br.readLine());
		int [] in = new int[n];
		
		StringTokenizer line = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			in[i] = Integer.parseInt(line.nextToken());
		}
		
		// 정렬
		Arrays.sort(in);
		
		int count = 0; // 횟수
		int start = 0; // 시작 포인터
		int end = n-1; // 끝 포인터
		
		// 2) 계산
		
		while (start < end) { // 교차 시 중지 
			int nSum = in[start] + in[end];
			
			if(nSum > sum) end--; // 정해진 합보다 클 경우 end 포인터 감소
			else if (nSum < sum) start++; // 정해진 합보다 작을 경우 start 증가
			else {
				count++;
				end--;
				start++;
			}
		}
		
		System.out.println(count);
		
	}
}
