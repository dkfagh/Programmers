import java.util.Arrays;

public class CaesarCipher {

	public static void main(String[] args) {
		String s = "X y z Z";
		
		String answer = "";
		
		int n = 4;
		
		char[] tempChar = new char[s.length()];
		
		for(int i = 0 ; i < s.length() ; i++) {
						
			// 주어진 String의 i번째 글자
			tempChar[i] = s.charAt(i);
			System.out.println(tempChar[i]);
			
			// i번째 글자가 공백인 경우
			if(tempChar[i]==32) {
				answer += tempChar[i];
				continue;
			} else {
				// i번째 글자가 a~z(소문자)이면서 n을 더했을 때 아스키코드값이 90보다 크거나, A~Z(대문자)이면서 n을 더했을 때 아스키코드값이 122보다 클 경우
				if(tempChar[i]>=65 && tempChar[i]<=90 && tempChar[i]+n>90 || tempChar[i]>=97 && tempChar[i]<=122 && tempChar[i]+n>122) {
					answer += (char)((tempChar[i]+n)-26);
				// 그 외 모든 경우
				} else {
					answer += (char)(tempChar[i]+n);
				}
			}

		}
		
		System.out.println(s);
		System.out.println(answer);

	}

}