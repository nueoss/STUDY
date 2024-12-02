package retry;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		Queue<Integer> q = new LinkedList<Integer>();

		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		while(q.size() != 1) {
			q.poll();
			q.add(q.poll());
		}
		
		System.out.println(q.poll());
	}
}
