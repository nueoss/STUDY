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

	}
}
