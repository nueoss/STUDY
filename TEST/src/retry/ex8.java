package retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex8 {
	
	static int [] answer;
	static int [] myAnswer;
	static int check;
	
 	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(line1.nextToken()); // 전체 길이
		int p = Integer.parseInt(line1.nextToken()); // 부분 길이
		
		// 문자 배열
		StringTokenizer line2 = new StringTokenizer(br.readLine());
		char [] arr = new char[s];
		arr = line2.nextToken().toCharArray();
		
		// 정답 배열
		answer = new int[4];
		myAnswer = new int[4];
		check = 0;
		
		StringTokenizer line3 = new StringTokenizer(br.readLine());
		for(int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(line3.nextToken());
			if(answer[i] == 0) check++;
		}
		
		int success = 0; // 총 개수
		
		for(int i = 0; i < p; i++) {
			Add(arr[i]);
		}
		
		if (check == 4) success++;
		
		for(int i = p; i < s; i++) {
			Add(arr[i]);
			Remove(arr[i - p]);
			
			if (check == 4) success++;
		}
		
		System.out.println(success);
	}
 	
 	private static void Add(char c) {
 		switch (c) {
 			case 'A': myAnswer[0]++; if(myAnswer[0] == answer[0]) check++;	break;
 			case 'C': myAnswer[1]++; if(myAnswer[1] == answer[1]) check++;	break;
 			case 'G': myAnswer[2]++; if(myAnswer[2] == answer[2]) check++;	break;
 			case 'T': myAnswer[3]++; if(myAnswer[3] == answer[3]) check++;	break;
		}
 	}
 	
 	private static void Remove(char c) {
 		switch(c) {
	 		case 'A': if(myAnswer[0] == answer[0]) check--; myAnswer[0]--;	break;
	 		case 'C': if(myAnswer[1] == answer[1]) check--; myAnswer[1]--;	break;
	 		case 'G': if(myAnswer[2] == answer[2]) check--; myAnswer[2]--;	break;
	 		case 'T': if(myAnswer[3] == answer[3]) check--; myAnswer[3]--;	break;
 		}
 	}
}
