package programmers;

public class test6 {
	public static void main(String[] args) {

		t6 t = new t6();
		
		String[] w = new String[] {".#...", "..#..", "...#."};
		t.solution(w);
		
	}
}

class t6 {
    public int[] solution(String[] wallpaper) {
        
        char[][] arr = new char[wallpaper.length][wallpaper[0].length()];
        
        // char로 변환
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                arr[i][j] = wallpaper[i].charAt(j);
            }
        }
        
        // 계산
        // #가 존재하는 최대 x, y와 최소 x, y를 구해야 함
        
        int xMin = 50;                                 
        int xMax = 0;
        int yMin = 50;
        int yMax = 0;
        
        // j가 x 좌표 i가 y좌표
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(arr[i][j] == '#') {
                    if(j > xMax) xMax = j;
                    if(j < xMin) xMin = j;
                    
                    if(i > yMax) yMax = i;
                    if(i < yMin) yMin = i;
                }
            }
        }
        
        
        int [] drag = new int[] {yMin, xMin, yMax + 1, xMax + 1};
        
        return drag;
    }
}
