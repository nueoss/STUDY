package programmers;

import java.util.Arrays;

public class test20 {
	public static void main(String[] args) {
		
		int [] array = new int[] {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int [] result = new int [commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            int [] sub = new int [end - start + 1 ];
            int num = 0;
            
            for(int j = start - 1; j < end; j++) {
                sub[num] = array[j];
                num++;
            }
            
            Arrays.sort(sub);
            result[i] = sub[k - 1];
        }
        
	}
}
