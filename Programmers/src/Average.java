
public class Average {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		
		double answer = 0;
		
		for(double item : arr) {
			answer += item;
		}
		
		answer/=arr.length;
		
		System.out.println(answer);
	}

}