import java.util.ArrayList;
import java.util.Arrays;

public class Divisor {

	public static void main(String[] args) {
		int[] arr = {3, 2, 6};
		
		int divisor = 10;
		
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % divisor == 0) {
				temp.add(arr[i]);
			}
		}
		
		if(temp.size() == 0) {
			temp.add(-1);
		}
		
		int[] answer = new int[temp.size()];
		
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = temp.get(i);
		}
		
		Arrays.sort(answer);
		
		System.out.println(Arrays.toString(answer));

	}

}
