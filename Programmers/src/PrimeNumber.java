
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 1000000;
		
		int answer = 0;
		
		// 1은 소수에서 제외되므로 2부터 시작
		for(int i = 2 ; i <= n ; i++) {
			
			int count = 0;
			
			// 소수는 1과 자기 자신으로 나뉘어지는 수 이므로 2부터 i까지 반복
			for(int j = 2 ; j <= i ; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			
			// count가 1인것은 나뉘어지는 수가 1과 자기 자신뿐인 경우이므로 answer에 더함
			if(count == 1) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}