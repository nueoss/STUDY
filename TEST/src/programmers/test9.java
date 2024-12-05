package programmers;

import java.util.ArrayList;
import java.util.List;

public class test9 {
	public static void main(String[] args) {

		t9 t = new t9();
		t.solution("aukks", "wbqd", 5);
	}
}

class t9 {
	
	 public String solution(String s, String skip, int index) {
	        
	       
		 // 1. 쉬운 탐색을 위해 list로 변환
	        List<Character> skipList = new ArrayList<>();
	        
	        for(int i = 0; i < skip.length(); i++) {
	            skipList.add(skip.charAt(i));
	        }
	                 
	         StringBuilder result = new StringBuilder();
	                         
	        // 2. 순회하며 확인
	        for(char c : s.toCharArray()) {
	            char cCount = c;
	            
	            for(int i = 1; i <= index; i++) {
	                cCount++;
	                
	                if(cCount > 'z') {
	                    cCount = 'a';
	                }
	                
	                if(skipList.contains(cCount)) {
	                    i--; // cCount의 횟수만 증가시키고 반복은 한번 더 실행
	                }
	            }
	            
	            result.append(cCount);
	        }
	        	
	    	return result.toString();
	    }
	}