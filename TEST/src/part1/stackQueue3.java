package part1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stackQueue3 {
	public static void main(String[] args) {

		/* 백준 2164번 카드게임 */
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();

		// 1. 변수 선정 및 초기화
		int num = sc.nextInt();
		
		
		for(int i = 0; i < num; i++) {
			q.add(i);
		}
		
		// 2. 한장 남을때까지 반복
		while(q.size() > 1) {
			q.poll(); // 첫장 버리기
			q.add(q.poll()); // 버린 거 다시 아래에 넣기
		}
		
		// 3. 한장 출력
		System.out.println(q.poll());
	}
}
