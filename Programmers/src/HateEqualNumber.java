import java.util.ArrayList;

public class HateEqualNumber {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 2, 1};
		
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(arr[0]);
		
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i-1] != arr[i]) {
				temp.add(arr[i]);
			}
		}

		int[] answer = new int[temp.size()];
		
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = temp.get(i);
		}
		
		System.out.println(java.util.Arrays.toString(answer));	
		
	}
}