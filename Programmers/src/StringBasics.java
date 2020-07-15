import java.util.Scanner;

public class StringBasics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		boolean answer = true;
		
		if(s.length() == 4 || s.length() == 6) {
			// ผýภฺดย 48~57
			for(int i = 0 ; i < s.length() ; i++) {
				
				System.out.println(s.charAt(i));
				
				if(s.charAt(i) > 47 && s.charAt(i) < 58) {
					continue;
				} else {
					answer = false;
				}
			}
		} else {
			answer = false;
		}
		
		System.out.println(answer);

	}

}