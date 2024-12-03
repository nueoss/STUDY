package programmers;

import java.util.HashMap;
import java.util.Map;

public class test4 {
	
	/* 레벨 1 - 추억 사진 */
	
	public static void main(String[] args) {
		t4 t = new t4();
		String[] name = new String[] {"may", "kein", "kain", "radi"};
		int [] yearning = new int[] {5, 10, 1, 3};
		String[][] photo = new String[][] {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

		t.solution(name, yearning, photo);
	}
}

class t4 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
    	
    	 int[] result = new int[photo.length];
         
         // map에 저장
         Map<String, Integer> map = new HashMap<>();
         
         for(int i = 0; i < name.length; i++){
             map.put(name[i], yearning[i]);
         }
         
         // 계산
         
         for(int i = 0; i < photo.length; i++) {
        	 int sum = 0;
             for(int j = 0; j < photo[i].length ; j++) {
            	 if(map.get(photo[i][j]) != null) {
            		 sum += map.get(photo[i][j]).intValue();
            	 } else {
            		 sum += 0;
            	 }
             }
             
             result[i] = sum;
             System.out.println(result[i]);
         }
    	
        int[] answer = {};
        return answer;
    }
}
