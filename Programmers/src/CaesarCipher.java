import java.util.Arrays;

public class CaesarCipher {

	public static void main(String[] args) {
		String s = "X y z Z";
		
		String answer = "";
		
		int n = 4;
		
		char[] tempChar = new char[s.length()];
		
		for(int i = 0 ; i < s.length() ; i++) {
						
			// �־��� String�� i��° ����
			tempChar[i] = s.charAt(i);
			System.out.println(tempChar[i]);
			
			// i��° ���ڰ� ������ ���
			if(tempChar[i]==32) {
				answer += tempChar[i];
				continue;
			} else {
				// i��° ���ڰ� a~z(�ҹ���)�̸鼭 n�� ������ �� �ƽ�Ű�ڵ尪�� 90���� ũ�ų�, A~Z(�빮��)�̸鼭 n�� ������ �� �ƽ�Ű�ڵ尪�� 122���� Ŭ ���
				if(tempChar[i]>=65 && tempChar[i]<=90 && tempChar[i]+n>90 || tempChar[i]>=97 && tempChar[i]<=122 && tempChar[i]+n>122) {
					answer += (char)((tempChar[i]+n)-26);
				// �� �� ��� ���
				} else {
					answer += (char)(tempChar[i]+n);
				}
			}

		}
		
		System.out.println(s);
		System.out.println(answer);

	}

}