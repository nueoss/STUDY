package At2026_Book;

import java.util.ArrayList;
import java.util.List;

public class Question16 {

	
	static List<List<Integer>> oGraph = new ArrayList<>();
	static boolean[] visited = new boolean[5];
	static boolean arrived;
	
	public static void main(String[] args) {
		// 1. 초기화
		for(int i = 0; i < 5; i++)
			oGraph.add(new ArrayList<Integer>());

		oGraph.get(0).add(1);
		oGraph.get(1).add(2);
		oGraph.get(1).add(0);
		oGraph.get(2).add(3);
		oGraph.get(2).add(1);
		oGraph.get(3).add(4);
		oGraph.get(3).add(2);
		oGraph.get(4).add(3);
		
		for(int i = 0; i < 5; i++) {
			DFS(i, 1);
			if(arrived) break;
		}
		
		if(arrived)
			System.out.println("1");
		else 
			System.err.println("0");
	}
	
	static void DFS(int pNum, int pDepth) {
		if(pDepth == 5 || arrived) {
			arrived = true;
			return;
		}
		
		visited[pNum] = true;
		
		for(int i : oGraph.get(pNum))
		{
			if(!visited[i])
				DFS(i, pDepth + 1);
		}
		
		visited[pNum] = false;
	}

}
