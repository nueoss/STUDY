package programmers;

import java.util.HashMap;
import java.util.Map;

public class test3 {
	
	/* 레벨 1 달리기 경주 */
	
	public static void main(String[] args) {
		t3 t = new t3();
		String [] players = new String[] {"mumu", "soe", "poe", "kai", "mine"};
		String [] callings = new String[] {"kai", "kai", "mine", "mine"};
		
		t.solution(players, callings);
	}
}

class t3 {
	 public String[] solution(String[] players, String[] callings) {
		 
		 Map<String, Integer> map = new HashMap<>();
		 
		 int index = 0;
		 for(String p : players) map.put(p, index++);
		 
		 for(String c : callings) {
			 int callingsIndex = map.get(c).intValue(); // get 함수는 값을 가져오는 것. 즉 인덱스 추출
			 int targetIndex = callingsIndex - 1; // 자리가 바뀔 선수의 인덱스
			 
			 String targetPlayer = players[targetIndex]; // 원래 순위 사람 저장
			 players[targetIndex] = c; // 앞에 순위로 바꿔줌
			 players[callingsIndex] = targetPlayer; // 원래 순위 사람은 뒤로
			 
			 // map에 저장
			 map.put(targetPlayer, callingsIndex);
			 map.put(c, targetIndex);
			 System.out.println(map);
		 }
		 
         return players;
    }
}