package programmers;

import java.util.Arrays;

public class test8 {
	public static void main(String[] args) {
		t8 t = new t8();
		String [] cards1 = new String[] {"i", "water", "drink"};
		String [] cards2 = new String[] {"want", "to"};
		String [] goal = new String[] {"i", "want", "to", "drink", "water"};
		t.solution(cards1, cards2, goal);
	}
}

class t8 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
    	
        int c1 = 0;
        int c2 = 0;
        
        String a = "a";
        System.out.println(a.hashCode());

        Integer integerNum = Integer.valueOf(c1);
        
         for(int i = 0; i < goal.length; i++) {
             if(c1 < cards1.length && cards1[c1].equals(goal[i])) {
                 c1++;
             } else if (c2 < cards2.length && cards2[c2].equals(goal[i])) {
                 c2++;
             } else {
                 return "No";
             }
         }
        
        return "Yes";
    	        
    }
}