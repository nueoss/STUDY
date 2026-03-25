package At2026_Programmars;

public class Lv2_Q9 {

	public static void main(String[] args) {

		System.out.println(solution(5000));
	}
	
	public static int solution(int n) {
		
		int iCnt = 0;
		while(n > 0 ) {
			if (n % 2 == 1)
			{
				n -= 1;
				iCnt++;
			}
			else 
				n /= 2;
		}
		
		return iCnt;
	}

}
