package retry;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ex9 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuffer bf = new StringBuffer();
		int n = sc.nextInt();
		int [] arr = new int[n];
		boolean result = true;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		int num = 1;
		
		for(int i = 0; i < n; i++) {
			int target = arr[i];
			
			if(target >= num) {
				while(target >= num) {
					stack.add(num++);
					bf.append("+/n");
				}
				stack.pop();
				bf.append("-/n");
			} else {
				int pop = stack.pop();
				
				if(pop > target) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-/n");
				}
			}
		}
		
		if(result) System.out.println(bf.toString());
	}
}
