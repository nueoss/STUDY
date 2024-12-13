package programmers;

import java.util.Arrays;

public class test18 {
	public static void main(String[] args) {
		
		String [] participant = new String[] {"mislav", "stanko", "mislav", "ana"};
		String [] completion = new String[] {"stanko", "ana", "mislav"};
		
		Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
            	System.out.println(participant[i]);
            }
        }
        
        System.out.println(participant[participant.length - 1]);
	}
}
