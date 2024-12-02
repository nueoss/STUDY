package retry;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>((o1, o2) -> {
			int first = Math.abs(o1);
			int second = Math.abs(o2);
			
			if (first == second) {
				return o1 > o2? 1 : -1;
			} else {
				return first - second;
			}
		});
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if(num != 0) {
				q.add(num);
			} else {
				if(q.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(q.poll());
				}
			}
		}
		
	}
}
