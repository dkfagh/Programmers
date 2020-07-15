import java.util.Arrays;

public class Tower {

	public static void main(String[] args) {
		int[] heights = {3, 9, 9, 3, 5, 7, 2};
		
		int[] answer = new int[heights.length];
		answer[0] = 0;
		
		for(int i = 1 ; i < answer.length ; i++) {
			
			for(int j = i-1 ; j >= 0 ; j--) {
				
				if(heights[i] < heights[j]) {
					answer[i] = j+1;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));

	}
}