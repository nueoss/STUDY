package part1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class slidingWindow2 {
	
	// public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer line1 = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(line1.nextToken()); // 전체 크기
		int p = Integer.parseInt(line1.nextToken()); // 슬라이딩 윈도우 크기
		
		StringTokenizer line2 = new StringTokenizer(br.readLine());
		
		Deque<Node> nums = new LinkedList<>(); // 숫자 배열 데크 형식
		
		for(int i = 0; i < s; i++) {
			int now = Integer.parseInt(line2.nextToken());
			
			while(!nums.isEmpty() && nums.getLast().value > now) { // 새로운 값보다 이전 값이 크다면 제거
				nums.removeLast();
			}
			
			nums.addLast(new Node(now, i));
			
			// 범위에서 벗어난 인덱스 제거
			if(nums.getFirst().index <= i - p) {
				nums.removeFirst();
			}
			
			bw.write(nums.getFirst().value + " ");
		}
		
		bw.flush(); // 출력
		bw.close();
	}

	// Node 형식 정하기
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}

