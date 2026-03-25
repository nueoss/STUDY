package At2026_Programmars;

public class Lv2_Q7 {

	
	public static void main(String[] args) {
		
		int[] iNumber =  {1, 1, 1, 1, 1};
		System.out.println(solution(iNumber, 3));
	}
	
	static int[] iNumber;
	static int iTarget;
	static int iResult = 0;
	public static int solution(int[] numbers, int target) {
		
		iNumber = numbers;
		iTarget = target;
		
        DFS(0, 0);
        return iResult;
    }
	
	static void DFS(int pIndex, int pSum) {
		if(pIndex == iNumber.length)
		{
			if(pSum == iTarget)
				iResult++;
			
			return;
		}
		
		DFS(pIndex + 1, pSum + iNumber[pIndex]);
		DFS(pIndex + 1, pSum - iNumber[pIndex]);
		
	}

}
