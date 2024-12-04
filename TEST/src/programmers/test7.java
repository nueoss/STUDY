package programmers;

public class test7 {
	public static void main(String[] args) {

		t7 t = new t7();
		String[] keymap = new String[] {"AGZ", "BSSS"};
		String[] targets = new String[] {"ASA","BGZ"};
		t.solution(keymap, targets);
		
	}
}

class t7 {
    public int[] solution(String[] keymap, String[] targets) {
       
        char [][] cKeymap = new char[keymap.length][];
        
        for(int i = 0; i < keymap.length; i++) {
            for(int j = 0; j < keymap[i].length(); j++) {
                cKeymap[i][j] = keymap[i].charAt(j);
                System.out.println(cKeymap[i][j]);
            }
        }
        
        int[] answer = {};
        return answer;
    }
}