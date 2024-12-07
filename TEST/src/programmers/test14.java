package programmers;

public class test14 {
	public static void main(String[] args) {
		
		int [] food = new int [] {1, 3, 4, 6};
		
        StringBuilder half = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            for(int j = 1; j <= (food[i] / 2); j++) {
                half.append(i);
            }
        }
        
        System.out.println(half.toString() + "0" + half.reverse());
	        
	    }
	}