package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test19 {

	public static void main(String[] args) {
		
		
		String [] id_list = new String[] {"muzi", "frodo", "apeach", "neo"};
		String [] report = new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		// 1. Set으로 중복 제거
        Set<String> reported = new HashSet<String>(Arrays.asList(report));
        
        // 2. 신고당한 횟수 카운트 --> map 사용
        Map<String, Integer> count = new HashMap<String, Integer>();
        
         for(String r : reported) {
            String reporter = r.split(" ")[1];
            count.put(reporter, count.getOrDefault(reporter, 0) + 1);
        }
        
        // 3. 정지 먹은 회원 판단
        Set<String> suspend = new HashSet();
            
        for(Map.Entry<String, Integer> map : count.entrySet()) {
            if(map.getValue() >= k) {
                suspend.add(map.getKey());
            }
        }
        
        // 4. 메일 보내기
        Map<String , Integer> mail = new HashMap<String, Integer>();
        
        for(String id : id_list) {
            mail.put(id, 0);
        }
        
        for(String r : reported) {
            String sender = r.split(" ")[0];
            String reporter = r.split(" ")[1];
            
            if(suspend.contains(reporter)) {
                mail.put(sender, mail.get(sender) + 1);
            }
        }
        
        
        // 5. set을 배열로 바꿔주기
        int [] result = new int [id_list.length];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = mail.get(id_list[i]);
        }
        
	}
}
