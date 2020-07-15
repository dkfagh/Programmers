import java.util.Arrays;
import java.util.Collections;

public class DescendingInteger {

	public static void main(String[] args) {
		
		
		
		
		long n = 9985123;
		
		// 주어진 long형 자연수 n을 문자열로 변환
		String s = Long.toString(n);
		
		String[] temp = s.split("");
				
		// 내림차순으로 정렬
		Arrays.sort(temp, Collections.reverseOrder());
		
		String x = "";
		
		// 내림차순으로 정렬한 숫자들을 하나씩 붙여서 문자열로 만들기
		for(String a : temp) {
			x += a;
		}
		
		// 문자열 x를 long형 자연수로 변환
		long answer = Long.parseLong(x);
		
		System.out.println(answer);
	}

}