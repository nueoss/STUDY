package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class slidingWindow1 {
	
	// 모든 메서드에서 사용할 수 있도록 static으로 선언
	static int checkArr[]; // 조건 배열
	static int myArr[]; // 현재 상태 배열
	static int total; // 몇 개의 문자와 관련된 개수를 충족했는지 판단

	public static void main(String[] args) throws IOException {

		/* 백준 12891번 DNA 비밀번호 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(br.readLine());
		
		// 1. 변수 초기화
		int length = Integer.parseInt(line1.nextToken()); // DNA 문자열 길이
		int sLength = Integer.parseInt(line1.nextToken()); // 부분 문자열 길이
		int result = 0; // 몇 개가 총 조건이 충족됐는지
		
		char [] arr = br.readLine().toCharArray(); // 입력받은 문자열 배열
		checkArr = new int[4]; // 4인 이유는 조건 A, C, G, T 4개이기 때문
		myArr = new int[4];
		total = 0;
		
		
		StringTokenizer line2 = new StringTokenizer(br.readLine());
		
		// 조건 저장
		for(int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(line2.nextToken());
			if(checkArr[i] == 0) total++; // 있든 없든 조건 무조건 충족하는 것이기 때문에 증가
		}
		
		// 2. 초기 윈도우 처리
		for (int i = 0; i < sLength; i++) {
		    Add(arr[i]);
		}
		
		if(total == 4) result++;
		
		// 3. 슬라이딩 윈도우 시작
		for(int i = sLength; i < length; i++) {
			int n = i - sLength; // 예. sLength = 4, i = 4이면 n = 0 length가 6이면 n=2까지
			
			Add(arr[i]); // arr[4] 
			remove(arr[n]); // arr[0]
			if(total == 4) result++; 
			
		}
		
		System.out.println(result);
		
		
	}
	
	// [조건에 맞는 문자 처리 1]
	// 새로 들어온 문자에 대한 조건 처리
	// 조건 배열인 check와 현재 my가 같을 경우 충족변수 +
	private static void Add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if(checkArr[0] == myArr[0]) total++;
			break;
		case 'C' :
			myArr[1]++;
			if(checkArr[1] == myArr[1]) total++;
			break;
		case 'G' :
			myArr[2]++;
			if(checkArr[2] == myArr[2]) total++;
			break;
		case 'T' :
			myArr[3]++;
			if(checkArr[3] == myArr[3]) total++;
			break;
		}
	}
	
	// [조건에 맞는 문자 처리 2]
	// 이전 문자 제거하기
	
	private static void remove(char c) {
		switch(c) {
		case 'A' :
			if(checkArr[0] == myArr[0]) total--;
			myArr[0]--;
			break;
		case 'C' :
			if(checkArr[1] == myArr[1]) total--;
			myArr[1]--;
			break;
		case 'G' :
			if(checkArr[2] == myArr[2]) total--;
			myArr[2]--;
			break;
		case 'T' :
			if(checkArr[3] == myArr[3]) total--;
			myArr[3]--;
			break;
		}
	}
	
}
