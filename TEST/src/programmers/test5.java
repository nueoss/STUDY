package programmers;

public class test5 {
	public static void main(String[] args) {
		t5 t = new t5();
		String[] park = new String[] {"SOO","OOO","OOO"};
		String[] routes = new String[] {"E 2","S 2","W 1"};
		int [] n = t.solution(park, routes);
	}
}

class t5 {
	
	static char [][] cPark;
	static int [] now; // 현재 위치
	
    public int[] solution(String[] park, String[] routes) {

    	// 정원 만들기
    	cPark = new char[park.length][park[0].length()]; 
    	
    	for(int i = 0; i < park.length; i++) {
    		for(int j = 0; j < park[i].length(); j++) {
    			cPark[i][j] = park[i].charAt(j);
    		}
    	}
    	
    	// 시작 위치 설정
    	now = new int[2];
    	
    	for(int i = 0; i < park.length; i++) {
    		for(int j = 0; j < park[i].length(); j++) {
    			if(cPark[i][j] == 'S') {
    				now[0] = i;
    				now[1] = j;
    				break;
    			}
    		}
    	}
    	
    	// 명령 처리
    	for(int i = 0; i < routes.length; i++) {
    		boolean isCorrect = move(routes[i].split(" ")[0], Integer.parseInt(routes[i].split(" ")[1]));
    	}
    	
        return now;
    }
    
    
    public static boolean move(String direction, int distance) {
    	
    	int x = now[1]; // 현재 가로
        int y = now[0]; // 현재 세로
    	
    	// 이동 시키기
    	for(int i = 0; i < distance; i++) {
    		
    		switch (direction) {
    		case "N": y--; break;
    		case "S": y++; break;
    		case "W": x--; break;
    		case "E": x++; break;
    		}
    		
    		
    		if (y < 0 || y >= cPark.length || x < 0 || x >= cPark[0].length) {
                return false; // 공원을 벗어나면 이동하지 않음
            }
    		
    		System.out.println(direction);
    		System.out.println(distance);
    		System.out.println(y + ", " + x);
    		
    		// X면 실행하지 않기
    		if(cPark[y][x] == 'X') {
    			return false;
    		}
    		
    	}
    	
		now[0] = y;
		now[1] = x;
		
		return true;
    }
    	
}
