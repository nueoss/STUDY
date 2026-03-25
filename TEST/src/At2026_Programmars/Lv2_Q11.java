package At2026_Programmars;

public class Lv2_Q11 {

	public static void main(String[] args) {
		
		System.out.println(solution(4));
	}
	

	static long solution(int n) {
		
		long [] dp = new long[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
		}
		

		return dp[n];
	}
	

}
