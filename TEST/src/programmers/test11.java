package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test11 {
	public static void main(String[] args) {

		t11 t = new t11();
		t.solution("banana");
	}
}

class t11 {
public int[] solution(String s) {
        

        int[] result = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(map.containsKey(c)) {
                result[i] = i - map.get(c);
            } else {
                result[i] = -1;
            }
            
            map.put(c, i);
            
        }
        
        
        return result;
    }
}