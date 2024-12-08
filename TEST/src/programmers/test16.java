package programmers;

public class test16 {
	public static void main(String[] args) {

		int a = 3;
		int b = 1;
		int n = 20;
		
		        
        int total = 0;
        
        while(n >= a) {
            int give = (n / a) * a;
            int receive = (give / a) * b;
            total += receive;
            n = n - give + receive;
            
        }
		        
	}
}
