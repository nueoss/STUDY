package At2026_Programmars;

public class Lv2_Q8 {

	public static void main(String[] args) {
		int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		System.out.println(solution(3, computers));

	}
	
	static int[][] iComputers;
	static boolean[] visited;
	static int iN;
    public static int solution(int n, int[][] computers) {
    	
    	iN = n;
    	visited = new boolean[n];
    	iComputers = computers;
    	
    	int iCnt = 0;
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			if(computers[i][j] == 1 && !visited[i]) {
    				iCnt++;
    				DFS(i);
    			}
    		}
    	}
    	
        return iCnt;
    }
    
    public static void DFS(int pNum) {
    	visited[pNum] = true;
    	
    	for(int i = 0; i < iN; i++) {
    		if(iComputers[i][pNum] == 1 && !visited[i])
    			DFS(i);
    	}
    }


}
