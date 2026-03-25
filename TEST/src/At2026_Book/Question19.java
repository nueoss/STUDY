package At2026_Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question19 {

	static int [] distance = new int[6];
	static boolean[] visitied= new boolean[6];
	static List<List<Edge>> oGraph = new ArrayList<List<Edge>>();
	public static void main(String[] args) {
		
		for(int i = 0; i < 6; i++) 
			oGraph.add(new ArrayList<Edge>());
		
		oGraph.get(1).add(new Edge(3, 2));
		oGraph.get(2).add(new Edge(4, 4));
		oGraph.get(3).add(new Edge(1, 2));
		oGraph.get(3).add(new Edge(4, 3));
		oGraph.get(4).add(new Edge(2, 4));
		oGraph.get(4).add(new Edge(3, 3));
		oGraph.get(4).add(new Edge(5, 6));
		oGraph.get(5).add(new Edge(4, 6));

		BFS(2);
		
		// 길이가 제일 큰 노드 가져오기
		int iMax = 0;
		int iMaxNode = 0;
		for(int i = 0; i < distance.length; i++)
		{
			if(iMax < distance[i]) {
				iMax = distance[i];
				iMaxNode = i;
			}
		}
		
		distance = new int[6];
		visitied = new boolean[6];
		BFS(iMaxNode);
		
		iMax = 0;
		iMaxNode = 0;
		for(int i = 0; i < distance.length; i++)
		{
			if(iMax < distance[i]) {
				iMax = distance[i];
				iMaxNode = i;
			}
		}
		
		System.out.println(iMax);
	}
	
	static void BFS(int pNum) {
		Queue<Edge> oQueue = new LinkedList<Edge>();
		oQueue.add(new Edge(pNum, 0));
		visitied[pNum] = true;
		
		while(!oQueue.isEmpty()) {
			
			Edge iNow = oQueue.poll();
			for(Edge iNext : oGraph.get(iNow.iNode)) {
				if(!visitied[iNext.iNode]) {
					oQueue.add(new Edge(iNext.iNode, iNext.iValue));
					distance[iNext.iNode] = distance[iNow.iNode] + iNext.iValue;
					visitied[iNext.iNode] = true;
				}
			}
		}
		
	}

}

class Edge {
	int iNode;
	int iValue;
	
	public Edge(int pNode, int pValue) {
		this.iNode = pNode;
		this.iValue = pValue;
	}
}
