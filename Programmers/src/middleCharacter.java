
public class middleCharacter {

	public static void main(String[] args) {
		String s = "abcdefgh";
		
		String answer = "";
		
		int len = s.length();
		
		if(len%2 == 1) {
			answer = s.substring(len/2, len/2+1);
		} else {
			answer = s.substring(len/2-1, len/2+1);
		}
		
		System.out.println(answer);
	}

}