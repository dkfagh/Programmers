
public class StringToInt {

	public static void main(String[] args) {
		String s = "11234";

		int answer = 0;
		
		String[] temp = s.split("");
		int len = temp.length;
		
		for(int i = 1 ; len - i >= 0 ; i++) {
			if(i==len) {
				if(temp[0].equals("+")) {
					break;
				} else if(temp[0].equals("-")) {
					answer*=-1;
					break;
				}
			} 
			answer += Integer.parseInt(temp[len-i]) * Math.pow(10, i-1);
		}
		
		System.out.println(answer);
	}

}