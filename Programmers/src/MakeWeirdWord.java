import java.util.Arrays;

public class MakeWeirdWord {

	public static void main(String[] args) {
		String s = "try hello world";
		
		String answer = "";
		
		String[] stringArr = s.split("");
		
		System.out.println(Arrays.toString(stringArr));

		int count = 0;
		
		for(int i = 0 ; i < stringArr.length ; i++) {
						
			if(stringArr[i].equals(" ")) {
				answer += " ";
				count = 0;
			} else {
				if(count%2 == 0) {
					answer += stringArr[i].toUpperCase();
					count++;
				} else {
					answer += stringArr[i].toLowerCase();
					count++;
				}
			}
			
		}
		
		System.out.println(answer);
	}

}