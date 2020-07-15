import java.util.Arrays;
import java.util.Scanner;

public class NaturalNumberReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		// �־��� �ڿ��� n�� �ڸ���
		int m = (int)(Math.log10(n)+1);
		
		int[] answer = new int[m];

		for(int i = 0 ; i < m ; i++) {
			
			answer[i] = (int) (n%10);
			
			n /= 10;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}