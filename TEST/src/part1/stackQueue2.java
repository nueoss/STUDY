package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stackQueue2 {
	public static void main(String[] args) throws IOException {

		/* 백준 17298번 오큰수 구하기 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine()); // 크기
		
		StringTokenizer line = new StringTokenizer(br.readLine());
		int [] arr = new int[size]; // 입력받은 수 배열
		
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(line.nextToken());
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < size; i++) {
			
		}
		
	}
}
