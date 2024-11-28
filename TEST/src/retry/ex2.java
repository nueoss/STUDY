package retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer line = new StringTokenizer(br.readLine());
		float [] grade = new float[n];
		float max = 0;
		float sum = 0;
		
		for(int i = 0; i < n; i++) {
			grade[i] = Integer.parseInt(line.nextToken());
			
			if(max < grade[i]) {
				max = grade[i];
			}
			
			sum += grade[i];
		}
		
		System.out.println(sum * 100.0 / max / n);
	}
}
