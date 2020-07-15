import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		String s = Integer.toString(n);
		
		String[] temp = s.split("");
		
		int answer = 0;
		
		for(int i = 0 ; i < temp.length ; i++) {
			
			answer += Integer.parseInt(temp[i]);
			
		}
		
		System.out.println(answer);
	}

}
