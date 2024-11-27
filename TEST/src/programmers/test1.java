package programmers;

public class test1 {

	public static void main(String[] args) {
		Solution s = new Solution();
		String ans = s.solution("abcde");
	}
}

class Solution {
    public String solution(String s) {
        
        String answer = "";
        
        int len = s.length();
        
        if(len % 2 != 0) {
            int num = len / 2; // 2 출력
            answer = String.valueOf(s.charAt(num));
        } else {
            int num = len / 2; // 2 출력
            answer = s.substring(num-1, num);
        }
        
        return answer;
    }
}