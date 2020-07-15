import java.util.Arrays;
import java.util.Collections;

public class DescendingCharacters {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		String answer = "";
		
		String[] temp = s.split("");
		
		// temp배열을 내림차순으로 정렬
		Arrays.sort(temp, Collections.reverseOrder());
		
		for(int i = 0 ; i < temp.length ; i++) {
			answer += temp[i];
		}
		
		System.out.println(answer);

	}

}