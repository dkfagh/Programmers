import java.util.Arrays;
import java.util.Collections;

public class DescendingInteger {

	public static void main(String[] args) {
		
		
		
		
		long n = 9985123;
		
		// �־��� long�� �ڿ��� n�� ���ڿ��� ��ȯ
		String s = Long.toString(n);
		
		String[] temp = s.split("");
				
		// ������������ ����
		Arrays.sort(temp, Collections.reverseOrder());
		
		String x = "";
		
		// ������������ ������ ���ڵ��� �ϳ��� �ٿ��� ���ڿ��� �����
		for(String a : temp) {
			x += a;
		}
		
		// ���ڿ� x�� long�� �ڿ����� ��ȯ
		long answer = Long.parseLong(x);
		
		System.out.println(answer);
	}

}