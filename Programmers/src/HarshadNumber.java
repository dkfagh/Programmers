
public class HarshadNumber {

	public static void main(String[] args) {
		
		boolean answer = false;
		
		int x = 18;
		
		// �� �ڸ��� ���ϱ�
		int a = x/1000;
		int b = (x/100)%10;
		int c = (x/10)%10;
		int d = x%10;
		
		// �� �ڸ����� ��
		int temp = a + b + c + d;
		
		//�ϻ��� �� ����
		if(x%temp == 0) {
			answer = true;
		}
		
		System.out.println(answer);
	}

}