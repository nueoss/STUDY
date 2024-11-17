package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class slidingWindow1 {
	
	// 모든 메서드에서 사용할 수 있도록 static으로 선언
	static int checkArr[]; // 조건 배열
	static int myArr[]; // 현재 상태 배열
	static int checkSecret; // 몇 개의 문자와 관련된 개수를 충족했는지 판단

	public static void main(String[] args) throws IOException {

		/* 백준 12891번 DNA 비밀번호 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(br.readLine());
		
		// 1. 변수 초기화
		int length = Integer.parseInt(line1.nextToken()); // DNA 문자열 길이
		int sLength = Integer.parseInt(line1.nextToken()); // 부분 문자열 길이
		
		char [] arr = new char[sLength]; // 입력받은 문자열 배열
		checkArr = new int[4]; // 4인 이유는 조건 A, C, G, T 4개이기 때문
		myArr = new int[4];
		checkSecret = 0;
		
		arr = br.readLine().toCharArray();
		
		StringTokenizer line2 = new StringTokenizer(br.readLine());
		
		// 조건 저장
		for(int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(line2.nextToken());
			if(checkArr[i] == 0) checkSecret++; // 있든 없든 조건 무조건 충족하는 것이기 때문에 증가
		}
		
		
	}
	
	// [조건에 맞는 문자 처리]
	// c가 조건에 있으면 ++
	// 조건 배열인 check와 현재 my가 같을 경우 충족변수 +
	private static void Add(char c) {
		
	}
	
}
