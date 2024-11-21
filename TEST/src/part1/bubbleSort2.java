package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bubbleSort2 {
	public static void main(String[] args) throws IOException {

		/* 백준 1377번 버블 소트 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		mData[] a = new mData[size];
		
		for(int i = 0; i < size; i++) {
			a[i] = new mData(Integer.parseInt(br.readLine()),i); 
		}
		
		Arrays.sort(a);
		
		int max = 0;
		for(int i = 0; i < size; i++) {
			
			if(max < a[i].index - i) { // a[i].index - i의 의미 = 원소가 이동한 인덱스 범위
				max = a[i].index - i;
			}
		}
		
		System.out.println(max + 1);
	}
}

class mData implements Comparable<mData> { // sort() 함수 실행하기 위한 정렬기준 정하기 위해 구현
	int value;
	int index;
	
	public mData(int value, int index) {
		this.value = value;
		this.index = index;
	}

	/* compareTo 메서드는 두 객체를 비교하여 정렬 순서를 정의 
	 * 음수, 양수, 0으로 반환한다 즉, 첫번째 객체가 두번째 객체보다 작은지 큰지 비교 */
	
	@Override
	public int compareTo(mData o) {
		return this.value - o.value;
	}
}