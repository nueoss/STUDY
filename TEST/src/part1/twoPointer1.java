package part1;

import java.util.Scanner;

public class twoPointer1 {
	public static void main(String[] args) {
		/* 백준 2018번 연속된 자연수의 합 구하기 */
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 값 초기화
		int n = sc.nextInt();
		int count = 1; // n 자체를 선택할 경우 카운트
		int sum = 1;
		int start_index = 1;
		int end_index = 1;
		
		// 2) 계산
		while(end_index != n) {
			if(sum > n) { // 합이 정해진 수보다 클 경우 (빼준다-> start 움직이기)
				sum -= start_index;
				start_index++;
			}
			else if (sum < n) { // 합이 정해진 수보다 작을 경우 (더해준다 -> end 움직이기) 
				end_index++;
				sum += end_index;
			}
			else { // 합이 N과 같을 경우 (count 횟수 올린다 후에 end 움직이기)
				count++;
				end_index++;
				sum += end_index;
			}
		}
		
		System.out.println(count);

	}

}
