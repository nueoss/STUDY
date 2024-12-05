package programmers;

import java.util.PriorityQueue;

public class test12 {
	public static void main(String[] args) {

		int [] score = new int[] {10, 100, 20, 150, 1, 100, 200};
		int[] answer = new int[score.length];
		int k = 3;
        
        PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> {
            return o1 > o2 ? 1 : -1;
        });
        
        for(int i = 0; i < score.length; i++) {
        	
        	que.add(score[i]); 
            
            if(que.size() > k) {
                que.poll();
            }
            answer[i] = que.peek();
        }
        
        
    }
}