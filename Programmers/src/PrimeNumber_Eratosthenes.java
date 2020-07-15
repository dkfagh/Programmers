
public class PrimeNumber_Eratosthenes {

	public static void main(String[] args) {
		
		int n = 120;
		
		double m = Math.ceil(Math.sqrt(n));
		
		int answer = 0;
		
		boolean[] temp = new boolean[n+1];
		
		temp[0] = temp[1] = true;
		
		for(int i = 2 ; i < m ; i++) {
			if(!temp[i]) {
								
				for(int j = 2 ; i*j <= n ; j++) {
					temp[i*j] = true;
				}
			}
		}
		
		for(int i = 0 ; i < temp.length ; i++) {
			if(!temp[i]) {
				System.out.println(i);
				answer++;
			}
		}
		
		System.out.println(answer);

	}

}