package retry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer line = new StringTokenizer(br.readLine());
		int [] nums = new int[n]; // 숫자 배열
		int [] ans = new int[n]; // 정답 배열
		
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(line.nextToken());
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		
		for(int i = 1; i < n; i++) {
			while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) { 
				// 스택의 꼭대기에 있는 인덱스의 수보다 크면 빼고 추가하기 !
				ans[stack.pop()] = nums[i];
			}
			
			stack.push(i);
		}
		
		while(!stack.empty()) {
			ans[stack.pop()] = -1;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < n; i++) {
			bw.write(ans[i] + " ");
		}
		
		bw.write("\n");
		bw.flush();
	}
}
