
public class IntSum {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		int sum = 0;
		
		if(a > b) {
			for(int i = b ; i <= a ; i++) {
				sum += i;
			}
		} else {
			for(int i = a ; i <= b ; i++) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

}
