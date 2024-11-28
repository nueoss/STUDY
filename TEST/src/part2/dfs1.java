package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class dfs1 {
	
	// dfs 함수에서 사용할 변수 정의
	static ArrayList<Integer> [] A;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {

		/* 백준 11724번 연결요소의 개수 구하기 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(br.readLine());
		
		int node = Integer.parseInt(line1.nextToken());
		int edge = Integer.parseInt(line1.nextToken());
		
		// 배열 1부터 시작하도록 초기화
		A = new ArrayList[node + 1]; // 인접 리스트 - 메모리 공간 할당
		visited = new boolean[node + 1]; // 방문 체크
		
		for(int i = 1; i <= node; i++) {
			A[i] = new ArrayList<Integer>(); // 저장할 준비
		}
		
		for(int i = 0; i < edge; i++) {
			StringTokenizer line2 = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(line2.nextToken());
			int n2 = Integer.parseInt(line2.nextToken());
			
			// 양쪽에 에지 더하기
			A[n2].add(n1);
			A[n1].add(n2);
			
		}
		
		int count = 0;
		
		for(int i = 1; i <= node; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		
		System.out.println(count);
	}
	
	static void DFS(int v) {
		if (visited[v]) {
			return;
		}
		
		// false인 경우, true로 바꿔주고 
		visited[v] = true;
		for(int i : A[v]) { 
			if (visited[i] == false) { // 연결 노드 중 방문하지 않앗던 노드만 탐색하기
				DFS(i); // 방문하지 않은 노드에 대해서 재귀함수 호출
			}
			
		}
	}
}
