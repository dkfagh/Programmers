import java.util.Arrays;

public class GCMandLCM {

	public static void main(String[] args) {
		int n = 14;
		int m = 49;
		
		int[] answer = new int[2];
		
		// �ִ�����
		// 1���� �־��� n, m �߿��� ���������� �ݺ�
		for(int i = 1 ; i <= min(n,m) ; i++) {
			if(n % i == 0 && m % i == 0) {
				answer[0] = i;
			}
		}
		
		// �ּҰ����
		// �־��� n, m �� ū������ n, m�� ������ �ݺ�
		for(int i = max(n,m) ; i <= n*m ; i++) {
			if(i % n == 0 && i % m== 0) {
				answer[1] = i;
				// �� ������ �����ϴ� ���� ���� ���� �ּҰ������ �ǹǷ� break�� �ɾ���
				break;
			}
		}
		
		System.out.println(Arrays.toString(answer));

	}

	// ���� �� ã��
	private static int min(int n, int m) {
		if(n > m) {
			return m;
		} else {
			return n;
		}
	}
	
	// ū �� ã��
	public static int max(int n, int m) {
		if(n > m) {
			return n;
		} else {
			return m;
		}
	}

}