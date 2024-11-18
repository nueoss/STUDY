package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stackQueue1 {
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 수열의 개수
		Stack<Integer> arr = new Stack<Integer>(); // 스택
		int num = 1; // 스택에 추가할 수
		boolean result = true; // 결과값
		StringBuffer bf = new StringBuffer(); // 콘솔창 입력
		
		for(int i = 0; i < n; i++) {
			
			int target = Integer.parseInt(br.readLine()); // 입력받은 수
			
			if(target >= num) {  // 예. target = 4 num = 1

				while (target >= num) { 
					arr.push(num++);
					bf.append("+\n");
				}
				
				arr.pop(); // target = num일 때 실행
				bf.append("-\n");
			
			} else { // target = 3이고 num이 5
				
				int num2 = arr.pop();
				
				if(num2 > target) {
					System.out.println("NO");
					result = false;
					break;
					
				} else {
					bf.append("-\n");
				}
				
			}
		}
		
		if(result) System.out.println(bf.toString());
		
	}
}
