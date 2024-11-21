package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class stackQueue4 {
	public static void main(String[] args) throws IOException {

		/* 백준 11286번 절댓값 힙 구하기 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
			
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if (first_abs == second_abs) {
				
				/* [1과 -1의 의미]
				 * 1은 뒤로 가야 함
				 * -1은 앞으로 가야 함  */
				
				return o1 > o2 ? 1 : -1;
				
			} else {
				return first_abs - second_abs;
			}
		}); 
		
		for(int i = 0; i < size; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) { // 제거
				if(q.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(q.poll());
				}
			} else { // 추가
				q.add(n);
			}
		}
	}
}
