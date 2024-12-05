package programmers;

public class test10 {
	public static void main(String[] args) {
		t10 t = new t10();
		String a = "10203";
		String p = "15";
		t.solution(a, p);
		
	}
}

class t10 {
    public int solution(String t, String p) {
        
        int start = 0;
        int end = p.length();
        int count = 0;
        
        while(start + p.length() <= t.length()) {
            long num = Long.parseLong(t.substring(start,end));
            if (num <= Long.parseLong(p)) count++;
            start++;
            end++;
        }
        return count;
    }
}