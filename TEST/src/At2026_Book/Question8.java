package At2026_Book;

public class Question8 {

	public static void main(String[] args) {
		String sDNA = "GATA";
		

		System.out.println(solution(4, 2, sDNA));
	}
	
	static int[] iMyArr = {0,0,0,0};// 현재 상태 저장
	static int iMyCnt = 0; // 맞는 개수 저장
	static int[] iTargetCnt = {2,0,1,1}; // 목표 개수
	
	public static int solution(int pPartLength, int pLength, String pDNA) {
		
		int iResult = 0;
		
		// 0이 되는 경우 증가 시키기
		for(int i = 0; i < 4; i++) {
			if(iTargetCnt[i] == 0)
				iMyCnt++;
		}
		
		// 첫 부분배열부터 먼저 수행
		for(int i = 0; i < pPartLength; i++) {
			Add(pDNA.charAt(i));
		}
		
		if(iMyCnt == 4)
			iResult++;
		
		for(int iAddIDX = pPartLength; iAddIDX < pLength; iAddIDX++) {
			int iRemoveIDX = iAddIDX - pPartLength;
			Add(pDNA.charAt(iAddIDX));
			Remove(pDNA.charAt(iRemoveIDX));
			
			if(iMyCnt == 4)
				iResult++;
		}
		
		
		return iResult;
	}
	
	public static void Add(char cWord) {
		
		switch (cWord) {
		case 'A':
			iMyArr[0]++;
			if(iMyArr[0] == iTargetCnt[0])
				iMyCnt++;
			break;
			
		case 'C':
			iMyArr[1]++;
			if(iMyArr[1] == iTargetCnt[1])
				iMyCnt++;
			break;

		case 'G':
			iMyArr[2]++;
			if(iMyArr[2] == iTargetCnt[2])
				iMyCnt++;
			break;
			
		case 'T':
			iMyArr[3]++;
			if(iMyArr[3] == iTargetCnt[3])
				iMyCnt++;
			break;
		}
	}
	
	public static void Remove(char cWord) {
		
		switch (cWord) {
		case 'A':
			if(iMyArr[0] == iTargetCnt[0])
				iMyCnt--;
			iMyArr[0]--;
			break;
			
		case 'C':
			if(iMyArr[1] == iTargetCnt[1])
				iMyCnt--;
			iMyArr[1]--;
			break;

		case 'G':
			if(iMyArr[2] == iTargetCnt[2])
				iMyCnt--;
			iMyArr[2]--;
			break;
			
		case 'T':
			if(iMyArr[3] == iTargetCnt[3])
				iMyCnt--;
			iMyArr[3]--;
			break;
		}
	}

}
