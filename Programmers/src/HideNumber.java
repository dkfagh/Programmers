
public class HideNumber {

	public static void main(String[] args) {
		String phone_number = "221555456484";
		
		// �־��� ��ȣ�� �� 4�ڸ��� ������ ���� ���ڸ� *�� ġȯ
		String temp = phone_number.substring(0, phone_number.length()-4).replaceAll(".", "*");

		// ������ ������ temp���� ���� ��ȣ�� �� 4�ڸ��� ����
		String answer = temp + phone_number.substring(phone_number.length()-4, phone_number.length());
		
		System.out.println(answer);
	}

}