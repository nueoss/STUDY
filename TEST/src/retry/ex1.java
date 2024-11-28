package retry;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String sNum = sc.next(); // 문자열일 경우 next() 사용하면 됨
		char[] cNum = sNum.toCharArray(); // 문자열 -> 문자형 : toCharArray / 문자형 -> 문자열 : String.valueOf
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += cNum[i] - '0'; // 문자열 -> 숫자로 바꿔주기 위해 - '0'을 해 준다
		}
		
		System.out.println(sum);
		
	}
}
