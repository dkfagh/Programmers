
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 1000000;
		
		int answer = 0;
		
		// 1�� �Ҽ����� ���ܵǹǷ� 2���� ����
		for(int i = 2 ; i <= n ; i++) {
			
			int count = 0;
			
			// �Ҽ��� 1�� �ڱ� �ڽ����� ���������� �� �̹Ƿ� 2���� i���� �ݺ�
			for(int j = 2 ; j <= i ; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			
			// count�� 1�ΰ��� ���������� ���� 1�� �ڱ� �ڽŻ��� ����̹Ƿ� answer�� ����
			if(count == 1) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}