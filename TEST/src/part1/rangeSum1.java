package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class rangeSum1 {
	public static void main(String[] args) throws IOException {
		
		// 백준 11659번 구간 합 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 사용자 입력 받기
		StringTokenizer line1 = new StringTokenizer(br.readLine()); // 문자열 분리
		
		// 1. 개수 정하기
		int nData = Integer.parseInt(line1.nextToken());
		int nQuiz = Integer.parseInt(line1.nextToken());
		
		// 2. 부분 합 배열 만들기
		long [] sArr = new long[nData + 1]; // sArr[0] = 0으로 초기화
		
		StringTokenizer line2 = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= nData; i++) {
			sArr[i] = sArr[i-1] + Integer.parseInt(line2.nextToken());
		}
		
		// 3. 질의 세 개 만들고 계산하기
		
		for(int i = 0; i < nQuiz; i++) {
			StringTokenizer line3 = new StringTokenizer(br.readLine()); // 질의를 반복해야 하니까 for문 안에 입력
			int q1 = Integer.parseInt(line3.nextToken());
			int q2 = Integer.parseInt(line3.nextToken());
			
			System.out.println(sArr[q2] - sArr[q1-1]);
		}
		
	}
}
