
public class DiscriminateSquareRoot {

	public static void main(String[] args) {
		long n = 121;
		
		long answer = 0;
		
		double sqrt = Math.sqrt(n);
		
		if(sqrt == (int)sqrt) {
			answer = (long)Math.pow(sqrt+1, 2);
			System.out.println(answer);
		} else {
			answer = -1;
			System.out.println(answer);
		}
		
	}
}