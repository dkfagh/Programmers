import java.util.Arrays;

public class GCMandLCM {

	public static void main(String[] args) {
		int n = 14;
		int m = 49;
		
		int[] answer = new int[2];
		
		// 최대공약수
		// 1부터 주어진 n, m 중에서 작은수까지 반복
		for(int i = 1 ; i <= min(n,m) ; i++) {
			if(n % i == 0 && m % i == 0) {
				answer[0] = i;
			}
		}
		
		// 최소공배수
		// 주어진 n, m 중 큰수부터 n, m의 곱까지 반복
		for(int i = max(n,m) ; i <= n*m ; i++) {
			if(i % n == 0 && i % m== 0) {
				answer[1] = i;
				// 두 조건을 만족하는 가장 작은 수가 최소공배수가 되므로 break를 걸어줌
				break;
			}
		}
		
		System.out.println(Arrays.toString(answer));

	}

	// 작은 수 찾기
	private static int min(int n, int m) {
		if(n > m) {
			return m;
		} else {
			return n;
		}
	}
	
	// 큰 수 찾기
	public static int max(int n, int m) {
		if(n > m) {
			return n;
		} else {
			return m;
		}
	}

}