package part1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class stackQueue2 {
	public static void main(String[] args) throws IOException {

		/* 백준 17298번 오큰수 구하기 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine()); // 크기
		
		// 1) 변수 정의
		StringTokenizer line = new StringTokenizer(br.readLine());
		int [] arr = new int[size]; // 입력받은 수 배열
		int [] ans = new int[size]; // 정답 배열
		
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(line.nextToken());
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0); // 비교를 위한 초기화
		
		// 2) 오큰수 판별 
		for(int i = 1; i < size; i++) {
			
			// 만약, arr[2] = 3이면 스택에 1과 2가 존재
			// arr[3] = 8이 되었을 때, ans[1, 2] = arr[8]이 된다. 
			
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) { // arr[0] = 3 arr[1] = 5 오큰수일 때, 정답 배열에 넣기
				ans[stack.pop()] = arr[i]; // 0이 pop되고, ans[0]= 5가 됨
			}
			
			stack.push(i);
			
		}
		
		// 3) -1 처리하기
		while(!stack.empty()) { // 반복문 다 돌고 stack이 빌 때까지 -1 넣기
			ans[stack.pop()] = -1;
		}
		
		// 4) 출력하기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i = 0; i < size; i++) {
			bw.write(ans[i] + " ");
		}
		
		bw.flush();
	}
}
