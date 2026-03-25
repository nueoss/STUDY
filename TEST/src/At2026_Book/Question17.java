package At2026_Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question17 {

	static List<List<Integer>> oGraph;
	static boolean[] visited = new boolean[5];
	static int[] DFSArr = new int[4];
	static int[] BFSArr = new int[4];
	static int iIDX = 0;
	public static void main(String[] args) {
	
		oGraph = new ArrayList<List<Integer>>();
		for(int i = 0; i < 5; i++)
			oGraph.add(new ArrayList<Integer>());
		
		oGraph.get(1).add(2);
		oGraph.get(1).add(3);
		oGraph.get(1).add(4);
		oGraph.get(2).add(1);
		oGraph.get(2).add(4);
		oGraph.get(3).add(1);
		oGraph.get(3).add(4);
		oGraph.get(4).add(1);
		oGraph.get(4).add(2);
		oGraph.get(4).add(3);
		
		for(int i = 0; i < 5; i++)
			Collections.sort(oGraph.get(i));
		
		DFS(1);
		
		visited = new boolean[5];
		iIDX = 0;
		
		BFS(1);
		int a= 0;
		
	}
	
	static void DFS(int iNum) {
		if(visited[iNum])
			return;
		
		DFSArr[iIDX++] = iNum;
		visited[iNum] = true;
		
		for(int i : oGraph.get(iNum)) {
			DFS(i);
		}
	}
		
	static void BFS(int iNum) {
		Queue<Integer> oQueue = new LinkedList<Integer>();
		oQueue.add(iNum);
		visited[iNum] = true;
		BFSArr[iIDX++] = iNum; 
		
		while(!oQueue.isEmpty()) {
			int iNow = oQueue.poll();
			for(int i : oGraph.get(iNow)) {
				if(!visited[i]) {
					BFSArr[iIDX++] = i;
					visited[i] = true;
					oQueue.add(i);
				}
			}
		}
		
		
	}
	
	

}
