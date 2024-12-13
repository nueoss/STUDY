package programmers;

import java.util.ArrayList;
import java.util.List;

public class test17 {
	public static void main(String[] args) {

		        
        List<Integer> list = new ArrayList<Integer>();
        		
        int [] number = new int[] {-2, 3, 0, 2, -5};
        
        for(int i : number) {
            list.add(i);
        }
        
        int cnt = 0;
        
        for(int i = 0; i < number.length; i++) {
            int n = 0;
            
            for(int j = 0; j < number.length; j++) {
                if(i == j) continue;
                n = -(number[i] + number[j]);
                if(list.contains(n)) cnt++;
            }
        }
		
	}
}
