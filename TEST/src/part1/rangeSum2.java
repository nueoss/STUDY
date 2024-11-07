package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class rangeSum2 {
	public static void main(String[] args) throws IOException {
		/* 백준 11660번 구간 합 구하기 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(br.readLine());
		
		// 1. 배열 사이즈, 질의 개수
		int nSize = Integer.parseInt(line1.nextToken());
		int nQize = Integer.parseInt(line1.nextToken());
		
		// 2. 2차원 배열 만들기
		int [][] sArr = new int[nSize + 1][nSize + 1]; // sArr[0] = 0
		
		for(int i = 1; i <= nSize; i++) {
			StringTokenizer line2 = new StringTokenizer(br.readLine());
			for(int j = 1; j <= nSize; j++) {
				sArr[i][j] = Integer.parseInt(line2.nextToken());
			}
		}
		
		// 3. 구간합 구하기
		int [][] dArr = new int[nSize + 1][nSize + 1];
		
		for(int i = 1; i <= nSize; i++) {
			for(int j = 1; j <= nSize; j++) {
				dArr[i][j] = dArr[i][j-1] + dArr[i-1][j] - dArr[i-1][j-1] + sArr[i][j];
			}
		}
		
		// 4. 질의
		for(int i = 0; i < nQize; i++) {
			StringTokenizer line3 = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(line3.nextToken());
			int y1 = Integer.parseInt(line3.nextToken());
			int x2 = Integer.parseInt(line3.nextToken());
			int y2 = Integer.parseInt(line3.nextToken());
			
			System.out.println(dArr[x2][y2] - dArr[x1-1][y2] - dArr[x2][y1-1] + dArr[x1-1][y1-1]);
		}
	}
}
