package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class insertionSort1 {
	public static void main(String[] args) throws IOException {

		/* 백준 11399번 ATM 인출 시간 계산하기 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine()); // 크기
		int [] n = new int[size]; // 배열
		int [] s = new int[size]; // 합 배열
		
		StringTokenizer line = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			n[i] = Integer.parseInt(line.nextToken()); 
		}
		
		// 삽입 정렬
		for(int i = 1; i < size; i++) {
			int insertPoint = i;
			int insertValue = n[i];
			
			for(int j = i-1; j >= 0; j--) {
				if(n[j] < n[i]) {
					insertPoint = j + 1;
					break;
				}
				
				if(j == 0) {
					insertPoint = 0;
				}
			}
			
			// 오른쪽으로 밀기
			for(int j = i; j > insertPoint; j--) {
				n[j] = n[j-1];
			}
			
			// 삽입
			n[insertPoint] = insertValue;
		}
		
		s[0] = n[0];
		
		// 합배열
		int sum = s[0];
		
		for(int i = 1; i < size; i ++) {
			s[i] = s[i-1] + n[i];
			sum += s[i];
		}
		
		System.out.println(sum);
		
		
	}
}
