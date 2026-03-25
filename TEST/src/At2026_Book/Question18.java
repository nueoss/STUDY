package At2026_Book;

import java.util.LinkedList;
import java.util.Queue;

public class Question18 {

	static int[][] iArr = {{1,1,0,1,1,0}, {1,1,0,1,1,0}, {1,1,1,1,1,1}, {1,1,1,1,0,1}};
	static boolean[][] visited = new boolean[4][6];
	
	static int[] dX = {1, -1, 0, 0};
	static int[] dY = {0, 0, 1, -1};
	public static void main(String[] args) {
		
		BFS(0,0);
		System.out.println(iArr[3][5]);
	}
	
	static void BFS(int pX, int pY) {
		Queue<int[]> oQueue = new LinkedList<int[]>();
		visited[pX][pY] = true;
		oQueue.add(new int[] {pX, pY});
		
		while(!oQueue.isEmpty()) {
			int[] iNow = oQueue.poll();
			for(int i = 0; i < 4; i++) {
				int x = iNow[0] + dX[i];
				int y = iNow[1] + dY[i];
				
				if(x >= 0 && x < iArr.length && y >= 0 && y < iArr[0].length && iArr[x][y] == 1 && !visited[x][y]) {
					oQueue.add(new int[] {x, y});
					visited[x][y] = true;
					iArr[x][y] = iArr[iNow[0]][iNow[1]] + 1;
				}
			}
		}
		
		
		
	}

}
