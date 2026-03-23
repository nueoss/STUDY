package At2026_Book;

import java.util.ArrayList;
import java.util.List;

public class Question14 {

	static List<List<Integer>> oGraph = new ArrayList<List<Integer>>();
	static boolean[] visited = new boolean[7];
	
	public static void main(String[] args) {
		
		// 1. 기본 설정
		// (1) 노드 생성 --> 개수: 6
		for(int i  = 0; i <= 6; i++) {
			oGraph.add(new ArrayList<Integer>());
		}
		
		// (2) 값 넣기
		oGraph.get(1).add(2);
		oGraph.get(1).add(5);
		oGraph.get(2).add(1);
		oGraph.get(2).add(5);
		oGraph.get(3).add(4);
		oGraph.get(4).add(3);
		oGraph.get(4).add(6);
		oGraph.get(5).add(1);
		oGraph.get(5).add(2);
		oGraph.get(6).add(4);
		
		// 2. 실행 
		int iCount = 0;
		for(int i = 1; i <= 6; i++) {
			if(!visited[i]) {
				iCount++;
				DFS(i);
			}
		}
		
		System.out.println(iCount);
		
	}
	
	static void DFS(int pV) {
		if(visited[pV])
			return;
		
		visited[pV] = true;
		for(int i : oGraph.get(pV)) {
			if(visited[i] == false)
				DFS(i);
		}
	}
	
	
	

}
