package part1;

import java.util.Scanner;

public class dataStructure {
	public static void main(String[] args) {
		
		/* 백준 11720번 숫자의 합 구하기 
		 * [문제] N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오. */
		
		// 값 받아오기
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		System.out.println("숫자를 입력하세요 : ");
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray(); // 문자로 바꿔 주기
		
		int sum = 0;
	   
		for(int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		
		System.out.println("모든 숫자의 합은 " + sum);

		
		// ------------------------------------------------------------------------
		
		/* 백준 1546번 평균 구하기 */
		
		// 1. 전체 과목 수 받아오기 + 선언
		System.out.println("전체 과목 수를 입력하세요 : ");
		
		int total = sc.nextInt();
		int [] score = new int[total]; // 이 부분 
		
		// 2. 점수 받아오기 + 최대값 구하기 + 총합 구하기
		
		long max = 0;
		long scoreSum = 0;
		
		for (int i = 0; i < total; i++) {
			System.out.println("과목의 점수를 입력하세요 : ");
			
			score[i] = sc.nextInt();
			if(max < score[i]) {
				max = score[i];
			}
			
			scoreSum += score[i];
		}
		
		System.out.println("변환 점수의 평균은 " + scoreSum * 100.0 / max / total);
		
		
	}
}
