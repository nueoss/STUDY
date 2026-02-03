package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test22 {
	public static void main(String[] args) {

		String [] phone_book = new String[] {"12", "123", "1245", "88"};
		boolean result = true;
		
		Arrays.sort(phone_book);
		
		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].startsWith(phone_book[i])) result = false;
        }
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println(result);
	}
}
