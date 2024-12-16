package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test19 {

	public static void main(String[] args) {
		
		
		String [] report = new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		
		// 1. Set으로 중복 제거
        Set<String> reported = new HashSet<String>(Arrays.asList(report));
        
        // 2. 신고당한 횟수 카운트 --> map 사용
        Map<String, Integer> count = new HashMap<String, Integer>();
        
        for(int i = 0; i < report.length; i++) {
            String reporter = report[i].split(" ")[1];
            count.put(reporter, count.getOrDefault(reporter, 0) + 1);
        }
        
        // 3. 정지 먹은 회원 판단
        for(int i = 0; i < count.size(); i++) {
        }
	}
}
